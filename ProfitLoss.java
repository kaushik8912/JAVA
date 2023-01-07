import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost Price");
        int cp = sc.nextInt();
        System.out.println("Enter selling  Price");
        int sp = sc.nextInt();
        int a = sp - cp;
        if (a >= 0) {
            System.out.println("Profit..." + a);
        } else {
            System.out.println("Loss..." + a);
        }
        sc.close();
    }
}
