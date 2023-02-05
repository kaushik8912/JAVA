import java.util.Scanner;

public class CelciusToFahren {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter tempature in Celcius : ");
        float cel = sc.nextInt();
        float far = cel*9/5+32;
        System.out.println("Temprature in Fahrenhit : "+far+"°F");
        sc.close();
    }
}
