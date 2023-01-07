import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        //int age =16;
        System.out.println("Enter your Age :");
        // scanner is pre define API(class)
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18 )
        System.out.println("You can drive....");
        else
        System.out.println("You can't drive....");
        sc.close();


    }
}
