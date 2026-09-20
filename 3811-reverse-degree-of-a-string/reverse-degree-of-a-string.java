class Solution {
    public int reverseDegree(String s) {        
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int n = (int)('z' - ch) + 1;
            int prd = n * (i+1);
            sum += prd;
        }
        return sum;
    }
}