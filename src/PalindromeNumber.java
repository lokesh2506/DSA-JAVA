import java.util.*;
public class PalindromeNumber {
    public static void palindromeCheck(int n){
        int ogValue = n, reversedValue = 0;

        while(n>0) {//n!=0
            int reminder = n%10; //last digit i will get
            reversedValue = (reversedValue * 10)+reminder;
            n/=10;  // it will remove the last didgit in the value
        }

        if(ogValue == reversedValue){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the N value");
        palindromeCheck(sc.nextInt());
    }
}
