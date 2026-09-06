class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] minval = new int[n];
        minval[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            minval[i] = Math.min(minval[i+1],nums[i]);
        }
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            if(max-minval[i] <= k){
                return i;
            }
        }
        return -1;
    }
}