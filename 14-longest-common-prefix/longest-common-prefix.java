class Solution {
    public String longestCommonPrefix(String[] str) {
        if(str.length == 0 || str == null){
            return "";
        }        
        int minlen = Integer.MAX_VALUE;
        for(String s:str){
            minlen = Math.min(minlen, s.length());
        }
        int low = 0;
        int high = minlen;
        while(low <= high){
            int mid = (low + high)/2;
            if(common(str,mid)){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return str[0].substring(0,(low+high)/2);
    }
    public boolean common(String[] str, int len){
        String str1 = str[0].substring(0,len);
        for(int i=1;i<str.length;i++){
            if(!str[i].startsWith(str1)){
                return false;
            }
        }
        return true;
    }
}