class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(nums.length < 2 || k == 0) return;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public void reverse(int[] nums, int st, int lt){

        while(st<lt){
            int temp = nums[st];
            nums[st] = nums[lt];
            nums[lt] = temp;
            st++;
            lt--;
        }
    }
}