import java.util.HashMap;

public class FreqCount {
    public static void main(String[] args) {
        String name ="aayush kaushik";
        HashMap<Character,Integer>map =new HashMap<>();
        for(int i=0;i<name.length();i++){
            char currchar = name.charAt(i);
            if(currchar==' '){
                continue;
            }
            if(map.get(currchar)==null){
                map.put(currchar,1);
            }
            else{
                int preValue =map.get(currchar);
                map.put(currchar,preValue+1);
            }
        }
    }
}
