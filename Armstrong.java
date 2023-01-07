import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // int num =153;
        System.out.println("Enter a Num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         int sum=0;
         int temp= num;
 
         while (num % 10 !=0) {
             int rem = num %10;
             sum += Math.pow(rem,3);
             num = num/10;
            
            }
         if(sum == temp)
         System.out.println("Armstrong....");
         else
         System.out.println("Not Armstrong...");
         sc.close();
     }
}
