//1
//23
//456
//78910
public class Pattern2 {
    public static void main(String[] args){
        int k=0;
        for(int i=0; i<4; i++){
            for(int j=0; j<i+1;j++){
                k++;
                System.out.print(k);

            }
            System.out.println();
        }
    }
    
}
