import java.util.Scanner;

class DecimalToBinary{
    public static void main(String[] args) {
        int i=0,binary[]= new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal Number");
        int num = sc.nextInt();
        sc.close();
        while(num!=0){
            binary[i] = num%2;
            num = num/2;
            i++;
        }   
        System.out.print("Binary number is :");
        for (int j=i-1;j>=0;j--) {
            System.out.print(""+binary[j]);
        }
    }
}