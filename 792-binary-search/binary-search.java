class Solution {
    public int search(int[] nums, int target) {
        int st = 0;
        int lt = nums.length-1;

        while(st<=lt){
            int mid = (st+lt)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                lt = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return -1;
    }
}