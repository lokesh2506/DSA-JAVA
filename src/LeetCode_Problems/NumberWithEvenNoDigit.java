public class NumberWithEvenNoDigit{
    public int findNumbers(int[] nums) {
        int size = nums.length;

        if (size < 1) return 0;

        int count = 0;
        for(int i = 0 ;i < size;i++){
            if((int)(Math.log10(nums[i])) % 2 == 1) count ++;
        }
        return count;
    }
}