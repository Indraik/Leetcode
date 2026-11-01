class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0;
        int temp;
        while(i<nums.length){
            int index = nums[i]-1;
            if(nums[i]!= nums[index]){
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            else{
                i++;
            }
        }

        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                arr.add(i+1);
            }
        }
        return arr;
    }
}