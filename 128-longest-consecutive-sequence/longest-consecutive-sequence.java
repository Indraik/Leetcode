class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();

        if(nums.length == 0) return 0;
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> lis = new ArrayList<>();
        for(int key:map.keySet()){
            lis.add(key);
        }
        if(lis.size() == 1) return 1;
        int max = 0;
        int count = 0;
        for(int i=1;i<lis.size();i++){
            if(lis.get(i)-lis.get(i-1) == 1){
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 0;
            }
        }
        System.out.print(lis);
        return max+1;
    }
}