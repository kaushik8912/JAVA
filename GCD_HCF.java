import java.util.Scanner;

public class GCD_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
            while(a!=0){
            int rem = a%b;
            if(rem==0){
                System.out.println(b);
            }
            a=b;
            b=rem;
        }
        System.out.println("HCF is :"+b);
    }
}
