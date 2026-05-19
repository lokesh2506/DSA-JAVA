
import java.util.*;
class Main {
    public static int minimumSumformedByDigits(int[]arr){
        int size = arr.length;
        Arrays.sort(arr);
        
        if(size == 0){
            return 0; 
        }
        
        int i=0,j=i+1;
        
        int first = 0,second =0;
        
        while(i<size-1 && j<size){
            first = (first*10)+arr[i];
            second = (second*10)+arr[j];
            i+=2;j+=2;
        }
        
        
        return first+second;
    }
    public static void main(String[] args) {
        int arr[]= {6,8,4,5,2,3};
        System.out.print(minimumSumformedByDigits(arr));
    }
}