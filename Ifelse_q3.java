// Wap to take input and check the character is vowel or consonants.
import java.util.Scanner;

public class Ifelse_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);
        sc.close();
        if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Vowels..");
        }
        else {
            System.out.println("Consonants..");
        }
    }
}
