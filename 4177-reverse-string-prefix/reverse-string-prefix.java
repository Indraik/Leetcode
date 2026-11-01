class Solution {
    public String reversePrefix(String s, int k) {
        if(k <= 1) return s;
        if(k == s.length()){
            StringBuilder res = new StringBuilder(s).reverse();
            return res.toString();
        }
        StringBuilder res = new StringBuilder(s.substring(0,k)).reverse();
        return res.toString() + s.substring(k);
    }
}