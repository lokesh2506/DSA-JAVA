import java.util.*;
class Main {
    public static int maxEle(int[]arr,int size){
        int max = 0;
        for(int i=0;i<size;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    
    public static int[] preSumArr(int[]freq,int []arr,int size,int max){
        // create a frequency array
        for(int i=0;i<size;i++){
            freq[arr[i]] += 1; 
        }

        // create a prefix sum
        for(int i = 1;i<max;i++){
            freq[i] += freq[i-1];
        }
        return freq;
    }
    
    public static int[] ansArr(int [] ans,int [] preSum,int [] arr,int size){
        for(int i=0;i<size;i++){
            int num = arr[i];
            ans[preSum[num]-1] = arr[i];
            preSum[num] -= 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={1,4,1,2,5,7,2};
        
        int size = arr.length;
        
        
        int max = maxEle(arr,size)+1;
        int preSum[] = preSumArr(new int[max],arr,size,max);
        
        int ans[] = ansArr(new int[size],preSum,arr,size);
       
       for(int i=0;i<size;i++){
           System.out.print(ans[i]);
       }
        
    }
}