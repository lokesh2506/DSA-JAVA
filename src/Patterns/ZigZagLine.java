package Patterns;

import java.util.Scanner;

public class ZigZagLine {
    public  static  void zigZag(int zz,int n){
        for(int i=0;i<zz;i++){
            for(int j=1;j<=n;j++){
                for(int k=1;k<=j;k++){
                    if(j==k){
                        System.out.print(k);
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int j=1;j<=n;j++){
               for(int z=5;z>=j;z--){
                   if(j==z){
                       System.out.print(z);
                   }else{
                       System.out.print(" ");
                   }
               }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the ZigZag:");
        int zz = sc.nextInt();
        System.out.println("Enter the value of the n:");
        int n = sc.nextInt();
        zigZag(zz,n);
    }
}
