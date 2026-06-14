public class lec7ex1 {
  public static void main(String[] args) {
    //boolean b = true;
    //int i = 9;
    // selection statements
    // normal if 
    //if(i > 5 && i < 10) {
     // System.out.println("i is greater than 5");

    //}
    //else{
    //   System.out.println("i is less than or equal to 5");

    //}

    // if ( i % 2 == 0) {
    //  System.out.println(" i is even number");
       
    //}
    //else{
    //  System.out.println("i is odd number");
    //}
    
    //nested ifs -->iska matlab if ke andar ek aur if
    //if ( i > 5) {
      //if ( i < 10 ){
        //if ( i == 7)

     // }
     // else {

      //}
      //else {

      //}
  //  }
  boolean b = true;
  //int i = 5;

  //if-else-if ladder
  //if ( i == 5 ){
  //  System.out.println(" i is 5");
  //}
  //else if ( i == 7 ){
  //  System.out.println("i is 6");
  //}
//else if ( i == 8 ){
//  System.out.println(" i is 8 ");
//}
//else if ( i == 9 ){
//  System.out.println(" i is 9 ");
//}

 int age = 50;

 if ( age > 80 ){
  System.out.println("you are very old");
}
else if (age > 60 ){
  System.out.println("you are very old");
}
else if ( age > 40 ){
  System.out.println("you are becomeing old");
}
else if ( age > 20 ){
  System.out.println("you are young ");
}
else{    // else isliye extra likhhe agar upar kohi condition nahi match karega else print
  System.out.println("you are a child");
}
// if, if-else, nested-if, if-else-if ladder
  }
}
