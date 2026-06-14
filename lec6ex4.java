public class lec6ex4 {
  public static void main(String[] args) {
    //logical operator
    int a = 10;
    int b = 15;
    int c = 20;
    
    boolean d = ( a < b ) && ( b < c ); //  and 
    boolean e = ( a < b ) || ( b < c ); // or



    System.out.println(d); //false
    System.out.println(e); // true
  }
}
