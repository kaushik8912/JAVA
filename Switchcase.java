import java.util.Scanner;

public class Switchcase {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("1.Addition");
      System.out.println("2.Subtraction");
      System.out.println("3.Multiplication");
      System.out.println("4.Division");
      System.out.println("Enter your Choice :");
      int ch=sc.nextInt();

      System.out.println("Enter first no :");
      int a =sc.nextInt();
      System.out.println("Enter second no :");
      int b =sc.nextInt();
      int result=0;
      switch (ch) {
        case 1:
          result=a+b;
          break;
          case 2:
          result=a-b;
          break;
          case 3:
          result=a*b;
          break;
          case 4:
          result=a/b;
          break;
      
        default:
        System.out.println("Invalid Input...");
      }
      System.out.println("Result is = " +result);
      sc.close();
    }
}
