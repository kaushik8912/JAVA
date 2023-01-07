public class PrimeNumber {
    public static void main(String[] args) {
        int num = 997679647;
        boolean prime = true;
        int count = 0;
        if (num % 2 == 0 || num % 3 == 0) {
            prime = false;
        }

        for (int i = 5; i * i < num; i += 6) {
            count++;
            if (num % i == 0 || num % (i + 2) == 0) {
                prime = false;
                break;

            }
        }
        System.out.println("Iteration use " + count);
        if (prime) {
            System.out.println("No. is Prime....");
        } else {
            System.out.println("No. is not Prime....");
        }
    }

}
