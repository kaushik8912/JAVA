public class PrintDigit {
    public static void main(String[] args) {
        //step-2 count digit
        int num =12345;
        int count = 0;
        for(int i =num; i!=0;i=i/10){
            count++;
        }
        System.out.println(count);
        // ster-2 after count compute the power
        int power =1;
        for(int i=1;i<=count-1;i++){
            power  = power * 10;

        }
        System.out.println(power);
        // step-3 logic for print digit
        for(int i=num;i!=0;power= power/10){
            System.out.println(i/power);
            i=i%power;
        }
    }
}
