import java.util.Scanner;

public class Fibonacci {
    public  static  void fibonacciSeries(int n){
        int fst = 0,snd = 1;
        System.out.println(fst+" "+snd);
        for(int i = 2;i<n;i++){
            int thrd = fst+snd;
            System.out.println(" "+thrd);
            fst = snd;
            snd = thrd;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       fibonacciSeries(sc.nextInt());
    }
}
