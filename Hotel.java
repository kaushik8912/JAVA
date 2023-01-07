import java.util.Scanner;

public class Hotel {
public static void main(String[] args) {
    System.out.println("Welcome in the Hotel");
    System.out.println("1.Breakfast");
    System.out.println("2.Lunch");
    System.out.println("3.Dinner");
    System.out.println("Enter your choice");
    Scanner sc = new Scanner(System.in);
    int ch = sc.nextInt();

  switch (ch) {
    case 1:{
        System.out.println("BreakFast Menu");
        System.out.println("1.Pratha");
        System.out.println("2.Tea");
        System.out.println("3.Noodles");
        System.out.println("4.Sandwich");
        System.out.println("Enter your Choice");
        int b = sc.nextInt();
        
            if(b==1){
                System.out.println("Pratha..");
                System.out.println("Enter the Quantity");
                int q= sc.nextInt();
                int p = 100*q;
                System.out.println("Order Confirm");
                System.out.println("Your Total Amount is : " + p );
            }
                else if(b==2){
                    System.out.println("Tea..");
                    System.out.println("Enter the Quantity");
                    int q= sc.nextInt();
                    int p = 50*q;
                    System.out.println("Order Confirm");
                    System.out.println("Your Total Amount is : " + p );
                }

                else if(b==3){
                    System.out.println("Noodles..");
                    System.out.println("Enter the Quantity");
                    int q= sc.nextInt();
                    int p = 150*q;
                    System.out.println("Order Confirm");
                    System.out.println("Your Total Amount is : " + p );
                }

                else if(b==4){
                    System.out.println("Sandwich..");
                    System.out.println("Enter the Quantity");
                    int q= sc.nextInt();
                    int p = 100*q;
                    System.out.println("Order Confirm");
                    System.out.println("Your Total Amount is : " + p );
                }
                else{
                    System.out.println("Invalid Selection");
                }
    

            


     }
        break;

        case 2:{
            System.out.println("Lunch Menu");
            System.out.println("1.Daal");
            System.out.println("2.Lassi");
            System.out.println("3.Roti");
            System.out.println("4.Mix Veg");
            System.out.println("Enter your Choice");
        int l = sc.nextInt();
        
            if(l==1){
                System.out.println("Daal..");
                System.out.println("Enter the Quantity");
                int q= sc.nextInt();
                int p = 200*q;
                System.out.println("Order Confirm");
                System.out.println("Your Total Amount is : " + p );
            }
                else if(l==2){
                    System.out.println("Lassi..");
                    System.out.println("Enter the Quantity");
                    int q= sc.nextInt();
                    int p = 100*q;
                    System.out.println("Order Confirm");
                    System.out.println("Your Total Amount is : " + p );
                }

                else if(l==3){
                    System.out.println("Roti..");
                    System.out.println("Enter the Quantity");
                    int q= sc.nextInt();
                    int p = 50*q;
                    System.out.println("Order Confirm");
                    System.out.println("Your Total Amount is : " + p );
                }

                else if(l==4){
                    System.out.println("Mix Veg..");
                    System.out.println("Enter the Quantity");
                    int q= sc.nextInt();
                    int p = 200*q;
                    System.out.println("Order Confirm");
                    System.out.println("Your Total Amount is : " + p );
                }
                else{
                    System.out.println("Invalid Selection");
                }
         }
            break;

            case 3:{
                System.out.println("Dinner Menu");
                System.out.println("1.Cold Drink");
                System.out.println("2.Pizza");
                System.out.println("3.Noodles");
                System.out.println("4.Sandwich");
                System.out.println("Enter your Choice");
        int d = sc.nextInt();
        
            if(d==1){
                System.out.println("Cold Drink..");
                System.out.println("Enter the Quantity");
                int q= sc.nextInt();
                int p = 100*q;
                System.out.println("Order Confirm");
                System.out.println("Your Total Amount is : " + p );
            }
                else if(d==2){
                    System.out.println("Pizza..");
                    System.out.println("Enter the Quantity");
                    int q= sc.nextInt();
                    int p = 300*q;
                    System.out.println("Order Confirm");
                    System.out.println("Your Total Amount is : " + p );
                }

                else if(d==3){
                    System.out.println("Noodles..");
                    System.out.println("Enter the Quantity");
                    int q= sc.nextInt();
                    int p = 150*q;
                    System.out.println("Order Confirm");
                    System.out.println("Your Total Amount is : " + p );
                }

                else if(d==4){
                    System.out.println("Sandwich..");
                    System.out.println("Enter the Quantity");
                    int q= sc.nextInt();
                    int p = 100*q;
                    System.out.println("Order Confirm");
                    System.out.println("Your Total Amount is : " + p );
                }
                else{
                    System.out.println("Invalid Selection");
                }
             }
                break;

    default:
    {
        System.out.println("Invalid Selection");
    }
        break;
}
    
    sc.close();
}    
}
