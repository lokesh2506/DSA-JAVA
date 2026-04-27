import java.util.Scanner;

public class OddNatural {
    public static int oddNatural(int n){
        // n = 3  1+3+5 -> 9
        // n = 5 1+3+5+7+9 -> 25


        // case 1 n*n

        int ans = 1;
        int cnt = 1;
        int i = 1;

        while(cnt<n){
            i+=2;
            ans+=i;
            cnt++;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(oddNatural(sc.nextInt()));
    }
}
