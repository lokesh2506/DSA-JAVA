package Patterns;

import java.util.Scanner;

public class LeftPyramid {
    public  static  void leftPyramid(int n){
        for(int i =0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public  static  void leftReversePyramid(int n){
        for(int i =n-1;i>=0;i--){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the n:");
        int n = sc.nextInt();
        leftPyramid(n);
        leftReversePyramid(n);
    }
}
