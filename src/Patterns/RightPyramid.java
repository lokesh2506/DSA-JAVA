package Patterns;

import java.util.Scanner;

public class RightPyramid {
    public  static  void rightPyramid(int n){
        for(int i =0;i<n;i++){
            //This loop for the space
            for (int k=0 ;k < n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public  static  void reverseRightPyramid(int n){
        for(int i = n-1;i>=0;i--){
            //This loop for the space
            for (int k=0 ;k < n-i-1;k++){
                System.out.print(" ");
            }
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
        rightPyramid(n);
        reverseRightPyramid(n);
    }
}
