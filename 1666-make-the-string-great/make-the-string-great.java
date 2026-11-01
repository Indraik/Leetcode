class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            int len = sb.length();
            if(len > 0 && Math.abs(sb.charAt(len-1) - cur) == 32){
                sb.deleteCharAt(len-1);
            }
            else{
                sb.append(cur);
            }
        }
        return sb.toString();
    }
}