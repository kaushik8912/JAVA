import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        //greater btwn 2 no's
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int c = sc.nextInt();

        if(a>b )
        System.out.println("A is greater...");

        else
        System.out.println("B is greater...");
        sc.close();
    }
}
