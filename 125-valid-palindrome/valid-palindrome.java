class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String sb = "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb += s.charAt(i);
            }
        }
        int l = 0;
        int r = sb.length()-1;
        while(l < r){
            if(sb.charAt(l)!=sb.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}