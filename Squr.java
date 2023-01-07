import java.util.Scanner;

class Squr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length :");
        int l = sc.nextInt();
        System.out.println("Enter the breath :");
        int b = sc.nextInt();
        sc.close();
        if (l==b) {
            System.out.println("SQUARE...");
        }
        else{
            System.out.println("NOT SQUARE...");

        }
    }
}