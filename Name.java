import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter your Name :"));
        String name = sc.nextLine();
        System.out.println(name);

        String namearr[] = name.split(" ");
        String Fullname = "";
        for (String word : namearr) {
            String n = String.valueOf(word.charAt(0)).toUpperCase() + 
            word.substring(1).toLowerCase();
            Fullname = Fullname +n+" ";
        }
        System.out.println(Fullname);
        sc.close();
    }
}
