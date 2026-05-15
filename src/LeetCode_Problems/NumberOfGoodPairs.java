public class NumberOfGoodPairs{
    public int numIdenticalPairs(int[] nums) {
        int cnt = 0;
        int size = nums.length;

        if (size < 2) return 0;

        Map <Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < size;i++){
            int prVal = map.getOrDefault(nums[i],0);
            cnt += prVal;
            map.put(nums[i],prVal+1);

        }

        return cnt;
    }
}