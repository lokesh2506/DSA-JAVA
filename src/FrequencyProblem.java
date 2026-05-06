import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyProblem {

    public static  boolean frequencyTarget(int target,int[] arr){
        // Add everything in the map for the frequency
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int i : arr){
            frequaencyMap.put(i,frequencyMap.getOrDefault(i,0)+1);
        }
        for(int key : frequencyMap.keySet()){
            int remianing = target - key;
            if(frequencyMap.getOrDefault(remianing,0) > 0) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,3,5,7,9};
        System.out.println("Enter the value of N: ");
        if(frequencyTarget(sc.nextInt(),arr)) System.out.println("Number present");;
    }
}
