class Solution {
    public String removeDuplicates(String s) {
        if(s.length() <= 1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            int len = sb.length();
            if(len > 0 && sb.charAt(len-1) == cur){
                sb.deleteCharAt(len-1);
            }
            else{
                sb.append(cur);
            }
        }
        return sb.toString();
    }
}