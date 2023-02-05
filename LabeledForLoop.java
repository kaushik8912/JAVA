public class LabeledForLoop {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 5; i++) {
            innerLoop: for (int j = 0; j < 5; j++) {
                if (i == 3) {
                    break outerLoop;
                
                }
                if (j == 4) {
                    
                    break innerLoop;
                }
            // System.out.print(i);
            // System.out.println(j);
        }
    }
}
}