class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curmax = 0,max=nums[0],curmin=0,min=nums[0],tot=0;
        for(int a:nums){
            curmax = Math.max(curmax + a, a);
            max = Math.max(curmax, max);
            curmin = Math.min(curmin + a, a);
            min = Math.min(curmin, min);
            tot += a;
        }
        return max > 0 ? Math.max(max, tot - min):max;
        
    }
}