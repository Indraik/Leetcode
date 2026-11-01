class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i += 2*k){
            int end = Math.min(i+k, n);
            String rev = s.substring(i,end);
            res.append(new StringBuilder(rev).reverse());
            if(i+k < n){
                int nextend = Math.min(i+2*k, n);
                res.append(s.substring(end,nextend));
            }
        }
        return res.toString();
    }
}