public class starpattern {
  public static void main(String[] args) {
    
    // Outer loop (Row controller)
    for( int i = 1 ; i<=4; i++){
        
        // Inner loop (Column controller)
        for( int j = 1 ; j<=4; j++ ){
            System.out.print("* "); // 1. Put the print statement INSIDE here
        }
        
        System.out.println(); // 2. Move the line break INSIDE the outer loop
    }
     
  }
}