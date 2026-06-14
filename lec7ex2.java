public class lec7ex2 {
  public static void main(String[] args) {
    //switch statement
    int i = 1; 

    switch(i){//switch(expression)-->byte, short, char, enumeration
      case 1:
        System.out.println("i is  1");
        break;
        case 2:
          System.out.println("i is 2");
          break;
          case 3:
            System.out.println("i is 3");
            break;
            default:
              System.out.println("i is greater than 3");
              break;
            //switch --> it has limited use case -->should evaluate to byte, short, int, char , enumeration
            //no duplicate case allowed
            //after jdk7 strings can also be used as switch expression
            //after jdk-14 switch is enchanced too much

    }

    //nested switch also teaches
    //selection statements
  }
}
