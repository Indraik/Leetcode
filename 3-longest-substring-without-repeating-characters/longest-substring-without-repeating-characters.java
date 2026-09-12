class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int l=0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max = Math.max(max,set.size());
            }
            else{
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(i));
            }
        }
        return max;
    }
}