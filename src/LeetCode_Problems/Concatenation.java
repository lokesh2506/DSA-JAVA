package LeetCode_Problems;

public class Concatenation {
    public int[] getConcatenation(int[] nums) {
        int ansSize = nums.length * 2;
        int [] ans = new int[ansSize];
        for(int i =0;i< nums.length;i++){
            ans[i]=nums[i];
            ans[nums.length+i] = nums[i];
        }
        return ans;
    }
}
