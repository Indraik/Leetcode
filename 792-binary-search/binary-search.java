class Solution {
    public int search(int[] nums, int target) {
        boolean x=false;
        int st = 0, lt = nums.length - 1, mid = 0;
        while(st <= lt){
            mid = (st+lt)/2;
            if(nums[mid]==target){
                x=true;
                return mid;
            }
            else if(nums[mid]<target){
                st = mid + 1;
            }
            else{
                lt = mid -1;
            }

        }
        
        return -1;
    }
}