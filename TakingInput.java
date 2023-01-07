import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args)  throws IOException{
        System.out.print("Enter Your Name : ");
        //int x = System.in.read();
        //will read one character at a time and return ASCII value of that character.

    
        // Scanner is a pre-defined class
        //scanner like buffer that stores input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter your Age:");
        int age = sc.nextInt();

        System.out.println("Name is : "+name); 
        System.out.println("Age is : "+age); 

        sc.close();

    }
}
