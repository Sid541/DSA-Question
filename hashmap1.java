import java.util.*;
import java.util.TreeMap;

public class hashmap1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        

        TreeMap<Integer,String> map=new TreeMap<>();
        for(int i=0; i<n; i++){
            int key=sc.nextInt();
            String value=sc.nextInt();
            map.put(key, value);
        }
        System.out.println("sorted list is"+map);

        
    }
}
