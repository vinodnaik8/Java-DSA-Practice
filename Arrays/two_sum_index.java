package Arrays;
import java.util.*;

public class two_sum_index {
    public static void main(String[] args) {
        HashMap<Integer,Integer> seen=new HashMap<>();
        int arr[]={2,7,11,15};
        int tar=9;

        for(int i=0;i<arr.length;i++){
            int com=tar-arr[i];
            if(seen.containsKey(com)){
                System.out.println(seen.get(com)+","+i);
            }
            seen.put(arr[i],i);
            }
        }
}
