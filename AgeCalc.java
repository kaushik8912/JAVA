import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your DOB[dd/mm/yyyy]");
        String dob = sc.nextLine();
        String arr[]= dob.split("/");
        int d= Integer.parseInt(arr[0]);
        int m= Integer.parseInt(arr[1]);
        int y= Integer.parseInt(arr[2]);

        var d1= LocalDate.of(y,m,d);
        var d2= LocalDate.now();

        var p = Period.between(d1,d2);

        System.out.println("Your Age is : "+p.getYears()+" Years, "+p.getMonths()+" Months, "+p.getDays()+" Days");
        sc.close();

    }
}
