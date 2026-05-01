package LeetCode_Problems;

public class RichestCustomerWealth {
    public int sumOfSubArray(int[] subArr){
        int size = subArr.length;

        if(size == 0) return 0;

        int sum = 0;
        for(int i=0;i<size;i++){
            sum += subArr[i];
        }
        return sum;
    }
    public int maximumWealth(int[][] accounts) {
        int size = accounts.length;

        if(size == 0) return 0;

        int sum = 0;

        for(int i=0;i<size;i++){
            int sumOfSubArray  = sumOfSubArray(accounts[i]);
            if(sumOfSubArray > sum){
                sum = sumOfSubArray;
            }
        }
        return sum;
    }
}
