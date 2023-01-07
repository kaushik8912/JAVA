import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        int count =0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        // System.out.println(count>2?"not a Prime Number":"Prime Number");
        sc.close();
           
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count>0?"Not a Prime Number":"Prime Number");
    }
}
