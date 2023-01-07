// Wap to take input and check weather it is a Character, digit or special character.
import java.util.Scanner;

public class Ifelse_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a value, alphabet or symbol");
        char ch = sc.next().charAt(0);
        sc.close();

        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println(" It is a Character...");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("It is a Number...");
        }
        else {
            System.out.println("It is a Special Character...");
        }
    }
}
