package LeetCode_Problems;

import java.util.Scanner;

public class FlipAndInvertImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        // Empty array check
        int rowSize = image.length;
        if (rowSize == 0 ) return new int[0][0];

        // code login
        int columnSize = image[0].length;
        for(int i = 0;i < rowSize; i++){
            for(int j = 0;j < (columnSize+1)/2; j++){
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][columnSize - j -1] ^ 1;
                image[i][columnSize - j - 1] = temp;
            }
        }
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<=(columnSize/2);j++){

            }
        }
        return image;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the n:");
        int n = sc.nextInt();
        int [][] image = new int[n][n];
        System.out.println("Enter the array value");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                image[i][j] = sc.nextInt();
            }
        }
        int [][] img = flipAndInvertImage(image);
        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[i].length;j++){
                System.out.print(img[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
