class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int temp;
        while(i<nums.length){
            int index = nums[i];
            if(nums[i]!=nums.length && nums[i]!= nums[index]){
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }
}