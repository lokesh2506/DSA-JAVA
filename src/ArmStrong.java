import java.util.Scanner;

public class ArmStrong {
    public static void amstrongNumber(int n){
        //153
        // 1cube -> 1   5cube -> 125    3cube-> 127  = 153
        int ogValue = n, amst = 0;

        while(n>0) {//n!=0
            int reminder = n%10; //last digit i will get
            amst+=(reminder*reminder*reminder);
            n/=10;  // it will remove the last digit in the value
        }

        if(ogValue == amst){
            System.out.println("amstrong Number");
        }
        else{
            System.out.println("Not amstrong Number");
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the N value");
        amstrongNumber(sc.nextInt());
    }
}
