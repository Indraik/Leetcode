class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String sb = "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb += s.charAt(i);
            }
        }
        StringBuilder ans = new StringBuilder(sb);
        ans.reverse();
        return sb.equals(ans.toString());
    }
}