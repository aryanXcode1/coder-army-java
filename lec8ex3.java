public class lec8ex3 {
  public static void main(String[] args) {
    //int i = 1;
    // comma separted variation
    
   /*
     for (int i = 1, j = 1; i <= 10 && j <= 5; i++, j+=2) {
      System.out.println(i * j);
    }
    // 1*1 =1
    // 2*3= 6
    // 3*5= 15
    // 4*7= 28
   */

    //boolean b = true;
    //for( int i=1; b == true; i++){
    //  if(condition) {
    //     b = false;
    //  }
    // }

    //integers -> byte, short, int, long

    /*always int can be written 
    for(int i =1 ; i <= 10; i++){
    System.out.println(i)}
     */

    //Nested loop
   // for(int i = 1; i<= 5; i++) {
     // for(int j = 1; j<= 5; j++) {
       // System.out.println(i);

    //  }
  
    

    /*
    *
    **
    ***
    ****
    *****
     */

    /*//nested loop--> star pattern always use nested loop
    for(int i = 1 ; i <= 5; i++){
      for(int j = 1; j <= i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }
*/

    //jump statements in java
    // break, continue

// boolean b =false;

 //for(int i = 1; i <=10; i++){
 // System.out.println(i);

 // if(b == true){
 //   break;
  //}
 //}

 //whether a number is prime or not
 //int p = 9;

 // 2, 3,4, 5,....6, 7
/* 
 int i;
 for(i =2; i < p; i++){
  if(p % i == 0) {
    System.out.println("the number is not prime");
    break;
  }
 }
 if(i == p) {
  System.out.println("the number is prime");
 }
 */

// for(int i=1; i<=10; i++) {
  
 // if(i%2 ==0){
 //   continue;
 // }
 // System.out.println(i);
// }

// break in nested loop
//
//      for(int i = 1 ; i <= 5; i++){
    /* *  for(int j = 1; j <= i; j++) {
        System.out.print(" * ");

        if(j >=5) {
          break;
        }
      }
      System.out.println();
    }
// contine in nested loop
// for(int i = 1 ; i <= 5; i++){
//      for(int j = 1; j <= i; j++) {
//       System.out.print(" * ");

//        if(j >=5) {
//          continue;
//        }
//      }
//      System.out.println();
*/

//labels--> outer and inner
/*outer: for(int i = 1 ; i <= 5; i++){
inner: for(int j = 1; j <= i; j++) {
        System.out.print(" * ");

        if(j >=5) {
          break outer; //also use continue
        }
      }
      System.out.println();
    }
     */

// code block
    
    first: {
      second:{
        third:{
        System.out.println("hello");
        break first;

    }
        }
    }





    

 


  }
}
 



