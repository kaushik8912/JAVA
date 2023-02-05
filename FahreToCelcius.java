import java.util.Scanner;

public class FahreToCelcius{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter tempature in Fahrenhit : ");
        float far = sc.nextFloat();
        float cel = (far-32)*5/9;
        System.out.println("Temorature in Celcius : "+cel+"°C");
        sc.close();
    }
}