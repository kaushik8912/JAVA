// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class BinaryToDecimal {
    // public static void main(String[] args) throws NumberFormatException,
    // IOException {
    // BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    // System.out.print("Enter a Binary number : ");
    // int num = Integer.parseInt(read.readLine(),2);
    // System.out.println(num);
    // }
    public static void main(String[] args) {
        // int num = 0b10111;
        // System.out.println(num);
        int decimal = 0, i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int bin = sc.nextInt();
        sc.close();
        while (bin != 0) {
            int rem = bin % 10;
            decimal = decimal + rem * i;
            i = i * 2;
            bin = bin / 10;
        }
        System.out.println("Decimal Vlaue is :" + decimal);
    }
}
