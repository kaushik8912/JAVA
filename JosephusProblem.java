public class JosephusProblem {
    static int game(int n,int k){
        int index =1;
        int result =0;
        while (index<=n) {
            result=(result+k)%index;
            index++;
        }
        return result+1;
    }
    public static void main(String[] args) {
       System.out.println( game(7, 2));
    }
}
