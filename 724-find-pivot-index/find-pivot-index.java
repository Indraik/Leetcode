class Solution {
    public int pivotIndex(int[] nums) {
        int totsum = 0, leftsum = 0, rightsum = 0;
        for(int num:nums){
            totsum += num;
        }
        for(int i=0;i<nums.length;i++){
            rightsum = totsum - leftsum - nums[i];
            if(leftsum == rightsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}