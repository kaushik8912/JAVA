//Wap to take input and check the character in upper case or lower case.
import java.util.Scanner;

public class Ifelse_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);
        sc.close();
        if(ch>='a' && ch<= 'z'){
            System.out.println(" Lower Case...");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Upper case...");
        }
        else{
            System.out.println("Wrong Input...");
        }
    }
    
}
