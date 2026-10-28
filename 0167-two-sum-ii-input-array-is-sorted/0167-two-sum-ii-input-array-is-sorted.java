class Solution {
    public int[] twoSum(int[] num, int tar) {
        int st = 0;
        int lt = num.length-1;
        while(st < lt){
            int sum = num[st] + num[lt];
            if(sum == tar){
                return new int[] {st+1,lt+1};
            }
            else if(sum > tar){
                lt--;
            }
            else{
                st++;
            }
        }
        return new int[] {-1,-1};
    }
}