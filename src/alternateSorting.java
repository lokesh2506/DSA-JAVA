
import java.util.*;
class Main {
    public static LinkedList<Integer> alternateSorting(int []arr){
        int size = arr.length;
        Arrays.sort(arr);
        LinkedList<Integer> ans = new LinkedList<>();
        
        for(int i =0;i<size/2;i++){
            ans.add(arr[size - 1-i]);
            ans.add(arr[i]);

        }
        
        if(size %2 !=0){
            ans.add(arr[size/2]);
        }
        
        
        return ans;
    }
    public static void main(String[] args) {
       int arr[]= {1,7,5,2,4,3,6};
       System.out.print(alternateSorting(arr));
    }
}