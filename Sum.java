import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is " + sum);

        sc.close();

    }
}
