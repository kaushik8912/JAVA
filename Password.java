import java.util.Scanner;
import java.io.*;

public class Password {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Email:");
        String email = sc.nextLine();
        System.out.println("Enter Your Password:");
        //String password = sc.nextLine();
        // get the object of console class...
        Console con =System.console();
        char[] chars = con.readPassword();
        String password = new String(chars);
        sc.close(); 

        if(email.equals("aayush@gmail.com") && password.equals("Aayush123")){

        System.out.println("Login Successfully....");
        System.out.println("***********Welcome************");
        }

        else{
            System.out.println("Invalid User ID or Password !!! Please Try Again");
        }
    
    }
}
