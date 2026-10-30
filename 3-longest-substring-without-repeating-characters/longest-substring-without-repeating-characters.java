class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxlen = 0;
        int left = 0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                maxlen = Math.max(maxlen,set.size());
            }
            else{
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(i));
            }
        }
        return maxlen;
    }
}