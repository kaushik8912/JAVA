import java.util.Scanner;
public class Employee {
    String  Name,Department;
    String Company = "BRAIN MENTORS";
    int BasicSalary,DA,CA,SA,HRA,TDS,EPF,GS,Deductions,NetSalary,PT,MA;
    // here we take a user input
    public void TakeInput(){
    Scanner z= new Scanner(System.in);
    System.out.println("enter the name");
    Name = z.next();
    System.out.println("enter the Department");
    Department=z.next();
    System.out.println("enter the basic salary");
   BasicSalary = z.nextInt();
    z.close();
    }

 
    // calculation part here 
    public void Calculations(){
        //Earnig part here
    HRA =  BasicSalary * (50/100);
    DA =(10/100) * BasicSalary;
    CA = (4/100) * BasicSalary;
    MA = (11/100) * BasicSalary;
    SA = (70/100) * BasicSalary;
    //gross salary
    GS = HRA+DA+CA+MA+SA+BasicSalary;
    //Deductions like as a Tax
    PT = (1/100) * BasicSalary;
    TDS =( 25/100) * BasicSalary;
    EPF = (12/100) * BasicSalary;
    Deductions = PT+TDS+EPF; 
    //NetSalary is total amount in your Hand
    NetSalary = GS - Deductions;
     }
     public void ShowAmount(){
        System.out.println("Company: "+Company);
         System.out.println("Department Name: "+Department);
         System.out.println("Name: "+Name);
         System.out.println("Basic Salary: "+BasicSalary);
         System.out.println("Dearness Allowance: "+DA);
         System.out.println("houseRentAl: "+HRA);
         System.out.println("conveyanceA: "+CA);
         System.out.println("medicalA: "+MA);
         System.out.println("specialA: "+SA);
         System.out.println("Gross Salary: "+GS);
         System.out.println("Professional TAX: "+PT);
         System.out.println("taxD: "+TDS);
         System.out.println("EmpPF: "+EPF);
         System.out.println("Deductions: "+Deductions);
         System.out.println("Net Salary: "+NetSalary);
     }
    
    public static void main(String[] args) {
    Employee emp = new Employee();
    emp.TakeInput();
    emp.ShowAmount();
    }
}