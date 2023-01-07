public class LabelforLoop {
    public static void main(String[] args) {
        outer:
         for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + " " + j);
                if (i == 2 && j==3) {
                    break outer;
                }
            }
        }
    }
}
