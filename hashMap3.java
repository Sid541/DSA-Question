import java.util.*;
import java.util.Map;

public class hashMap3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                System.out.println("yes");
                ans=1;
                break;
            }
            map.put(arr[i],1);
            
        }
        if(ans==0){
            System.out.println("No");
        }
        

        
    }
}
