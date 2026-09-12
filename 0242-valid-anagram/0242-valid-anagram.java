class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i),0)+1);
        }
        for(Character c: map.keySet()){
            if(map.containsKey(c)&&map1.containsKey(c)){
            int c1 = map.get(c);
            int c2 = map1.get(c);
             if( c1 != c2){
                return false;
            }
            }
            else
            return false;
           
        }
        return true;
    }
}