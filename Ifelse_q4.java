//WAP to input to take month and print number of days in a month.
import java.util.Scanner;

public class Ifelse_q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month no. :");
        int a = sc.nextInt();
        sc.close();

        if(a==1){
            System.out.println("January has 31 Days");
        }
        else if(a==2){
            System.out.println("Feburary has 28 Days");
        }
        else if(a==3){
            System.out.println("March has 31 Days");
        }
        else if(a==4){
            System.out.println("April has 30 Days");
        }
        else if(a==5){
            System.out.println("May has 31 Days");
        }
        else if(a==6){
            System.out.println("June has 30 Days");
        }
        else if(a==7){
            System.out.println("July has 31 Days");
        }
        else if(a==8){
            System.out.println("August has 31 Days");
        }
        else if(a==9){
            System.out.println("September has 30 Days");
        }
        else if(a==10){
            System.out.println("October has 31 Days");
        }
        else if(a==11){
            System.out.println("Noember has 30 Days");
        }
        else if(a==12){
            System.out.println("December has 31 Days");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
