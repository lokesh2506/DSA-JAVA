
import java.util.*;
class Main {
    public static int  maxSubArrofZero(int []arr){
        HashMap <Integer,Integer> map = new HashMap<>();
        
        int preSum = arr[0];
        map.put(preSum,0);
        int ans = (preSum == 0)? 1:0;
        
        for(int i =0;i<arr.length;i++){
            preSum += arr[i];
            if(preSum == 0){
                ans = Math.max(ans,i+1);
            }else{
                if(map.containsKey(preSum)){
                    ans=Math.max(ans,i-map.get(preSum));
                }else{
                    map.put(preSum,i);
                }
            }
        }
        
        
        
        return ans;
    }
    public static void main(String[] args) {
       int arr[]= {15,-2,2,8,-1,-7,10,23};
       System.out.print(maxSubArrofZero(arr));
    }
}