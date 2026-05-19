
import java.util.*;
class Main {
    public static int[] immediateSmallestEle(int[]arr){
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                arr[i] = arr[i+1];
            }else{
                arr[i] = -1;
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }
    public static void main(String[] args) {
        int arr[]= {5,6,2,3,1,7};
        System.out.print(Arrays.toString(immediateSmallestEle(arr)));
    }
}