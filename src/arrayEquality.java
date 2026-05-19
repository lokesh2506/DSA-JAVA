
import java.util.*;
class Main {
    public static boolean equArr(int []a,int[]b){
        HashMap<Integer,Integer> map = new HashMap<>();
       
       for(int i=0;i<a.length;i++){
           map.put(a[i],map.getOrDefault(a[i],0)+1);
       }
       
       for(int i=0;i<b.length;i++){
           if(map.containsKey(b[i])){
               map.put(b[i],map.get(b[i])-1);
           }else{
               return false;
           }
       }
       
       for(Integer i : map.keySet()){
           if(map.get(i) > 0){
               return false;
           }
       }
       
       return true;
    }
    public static void main(String[] args) {
       int a[]= {1,2,3,3,2,4};
       int b[]= {1,2,3,3,3,4};
       System.out.print(equArr(a,b));
    }
}

// false

