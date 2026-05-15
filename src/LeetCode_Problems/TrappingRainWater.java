class Solution {

    public int leftMaxNum(int max, int num){
        return Math.max(max,num);
    }
    public int trap(int[] height) {
        int size = height.length;
        int leftMax = height[0],trap = 0;

        int rightMax [] = new int[size];
        rightMax[size-1] = height[size-1];
        for(int i = size-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }

        for(int i = 1;i < size -1;i++){
            leftMax = leftMaxNum(leftMax,height[i-1]);
        
            int minVal = Math.min(leftMax,rightMax[i+1]);
            int curr = height[i];

            if(minVal > curr){
                trap += Math.abs(minVal - curr);
            }
        }

        return trap;
    }
}