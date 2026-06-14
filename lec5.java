public class lec5 {
  public static void main(String[] args) {
    // 1 .Implicit conversion
    //byte to int 
    //byte b = 34;
    //int i;
    //i = b;
  //System.out.println(i);//34

  // character to int
   //char c = 'a';
   //int i;
   //i = c;
   //System.out.println(i);

   // 2 . explicit conversion
   //int i = 24;
   //byte b;//byte range -128 to +127

   //b = i; yeh nahi iske liye casting karna hoga
   //b = (byte) i;
   //System.out.println(b);//24

   // 3. trancating conversion
   //float f = 15.678f;
   //int i;
   
   //i = (int) f;
   //System.out.println(i);//15

   //boolean to any data 
   //these conversions are not possible

   //ex 
   // boolean bool = false;
   // int i ;
   // i = bool; 

   byte b = 50;
   b = (byte) (b * 2) ;// bracket isliye laga hai expression liye
   System.out.println(b);






  } 
}
