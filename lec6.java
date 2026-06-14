public class lec6 {
  public static void main(String[] args) {
    //operator in java
    //arithmatic operators-- +,-,*,/,%,+=,-=,*=,/=,%=,++, --

    int a = 5;
    int b = 10;

    int c = a + b; //15
    int d = a - b; //-5
    int e = a * b; //50
    int f = b / a; //2
    int g = b % a; //0

    System.out.println(c + " , " + d + " , " + e + ", " + f + " , " + g);


    int h = a + 2;

     //h = h + 2;//since this is okay in cse
     h += 2; //mean h = h + 2; //h = 9

     h -= 2; // h = h - 2; //h = 7

     h *= 3; // h = h * 3; //h = 21

     h /= 5; // h = h / 5; 

     h %= 5; // h = h % 5; 

     System.out.println(h);

//increment ++ ,  decrement -- examples
     int i = 6;
     i++; // i = i + 1; same as i += 1 ; i = 7
     i--; // i = i - 1; same as i -= 1 ; i = 7-1 = 6
     System.out.println(i);

     // pre increment and post increment / decrement
     int j = 7;
     j++; //postfix - increment badme ++ kar diya 
     ++j; //prefix - increment phele ++ kar diya 

     //System.out.println(j); //output =9

     //new

     // j = 9
     int k = j++; //k = j; j = j + 1;
     System.out.println(j + ", " + k ); //10 ,9

     int l = ++j; //l = j + 1;
     System.out.println(j + " , " + l); //11 , 11

     





  }
}
