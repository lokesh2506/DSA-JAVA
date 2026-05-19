
import java.util.*;
class Main {
    public static int[] sortBinaryArr(int []arr){
        int zero = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        
        for(int i =0;i<arr.length;i++){
            if(zero > 0){
                arr[i] =0;
                zero--;
            }else{
                arr[i] =1;
            }
        }
        
        return arr;
    }
    public static void main(String[] args) {
       int arr[]= {1,0,0,1,0,1};
       System.out.print(Arrays.toString(sortBinaryArr(arr)));
    }
}