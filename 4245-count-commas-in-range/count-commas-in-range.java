class Solution {
    public int countCommas(int n) {
        if(n <= 999) return 0;
        int num = n - 999;
        int count = 0;
        for(int i=1;i<=num;i++){
            count++;
        }
        return count;
    }
}