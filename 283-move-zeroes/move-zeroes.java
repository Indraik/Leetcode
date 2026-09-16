class Solution {
    public void moveZeroes(int[] nums) {
        int tem = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[tem++] = nums[i];
            }
        }
        while(tem < nums.length){
            nums[tem] = 0;
            tem++;
        }
    }
}