import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        System.out.println("Enter Your Choice...");
        System.out.println("1.Drinks");
        System.out.println("2.Sweets");
        System.out.println("3.Snaks");
        

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("Drink Pepsi");
        }
        if(choice==2){
            System.out.println("Sweets Chocolate");
        }
        if(choice==3){
            System.out.println("Snaks kurkure");
        }
        else{
            System.out.println("Wrong Choice...");
        }
        
        sc.close();
    }
}
