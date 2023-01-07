import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ifelse_q5{
    
    public static void main(String[] args) {
        final int MONTHS = 12;
       // String Company = "Amazon";
        Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Your Name");
		// String Name = sc.nextLine();
		// System.out.println("Enter Your ID");
		// int id = sc.nextInt();
		System.out.println("Enter Your Basic Salary");
		double BasicSalary = sc.nextDouble();       
        sc.close();
        double hra= BasicSalary*0.50;
        double da= BasicSalary*0.10;
        double ta = BasicSalary*0.40;
        double ma = BasicSalary*0.30;
        double pf = BasicSalary*0.05;
        double gs = BasicSalary + hra + da + ta + ma;
        //double tax = gs*0.10;
        //Formating code
        Locale locale = new Locale("en", "US");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        System.out.println("---------------------");
        System.out.println("|    Salary Slip    |");
        System.out.println("---------------------");

        // System.out.println(" ID            :  "+id);
        // System.out.println(" Name          :  "+Name);
        //System.out.println(" Company       :  "+Company);
        System.out.println(" Basic Salary  :  "+nf.format (BasicSalary));
        System.out.println(" Hra           :  "+hra);
        System.out.println(" Da            :  "+da);
        System.out.println(" Ta            :  "+ta);
        System.out.println(" Ma            :  "+ma);
        System.out.println(" Gross Salary  :  "+gs);

        double as = gs*MONTHS;
        System.out.println(" Annual Salary :  "+as);
        if(as>=500000 && as<800000){
            double tax= as*0.10;  
            double ns = as-pf-tax;
            System.out.println(" Tax           :  "+tax);
            System.out.println(" Pf            :  "+pf);
            System.out.println(" Net salary    :  "+ns);
        }
        else if(as>=800000 && as<1000000){
            double tax = as*0.20;
            double ns = as-pf-tax;
            System.out.println(" Tax           :  "+tax);
            System.out.println(" Pf            :  "+pf);
            System.out.println(" Net salary    :  "+ns);

            
        }
        else if(as>=1000000){
            double tax = as*0.30;
            double ns = as-pf-tax;
            System.out.println(" Tax           :  "+tax);
            System.out.println(" Pf            :  "+pf);
            System.out.println(" Net salary    :  "+ns);

        }
        
       
            
        }
}
