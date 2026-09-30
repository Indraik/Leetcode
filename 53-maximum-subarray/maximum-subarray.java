class Solution {
    public int maxSubArray(int[] nums) {
        int cursum = 0;
        int maxsum = nums[0];

        for(int i=0;i<nums.length;i++){
            cursum = Math.max(cursum+nums[i],nums[i]);
            maxsum = Math.max(cursum,maxsum);
        }
        return maxsum;
    }
}