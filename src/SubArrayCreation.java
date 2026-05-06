import java.util.ArrayList;

public class SubArrayCreation {
    public static void subArray (int [] arr){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int size = arr.length;
         int subArrSize = 1 << size;

         for(int i = 0 ;i < subArrSize;i++){
             int mask = 1;
             ArrayList<Integer> sub = new ArrayList<>();
             for(int j=0; j < size ;j++){
                 if((mask << j) & i != 0){
                     sub.add(arr[j]);
                 }
             }
             list.add(sub);
         }

         for(ArrayList<Integer> l:list){
             System.out.println( l);
         }
    }
    public static void main(String[] args) {
        int arr [] = {3,2,1};
        subArray(arr)
    }
}