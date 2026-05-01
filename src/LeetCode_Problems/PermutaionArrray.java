package LeetCode_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class PermutaionArrray {

//    public static  void permutationArray(int[] arr,int size){
//        int permutationArr [] = new int[size];
//
//        for(int i =0;i<size;i++){
//            permutationArr[i] = arr[arr[i]];
//        }
//        System.out.println(Arrays.toString(permutationArr));
//    }

//    recursion
    public static  void permutationArray(int[] arr,int size) {
        if(size < arr.length){
            int temp = arr[arr[size]];
            permutationArray(arr,size++);
            arr[size] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the n:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Values:");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

//        permutationArray(arr,n);

//        recursion
        permutationArray(arr,0);
    }
}
