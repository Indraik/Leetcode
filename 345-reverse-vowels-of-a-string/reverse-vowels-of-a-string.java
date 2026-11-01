class Solution {
    public String reverseVowels(String s) {
        StringBuilder vov = new StringBuilder();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('o');
        set.add('O');
        set.add('u');
        set.add('U');
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                vov.append(c);
            }
        }
        char[] res = s.toCharArray();
        vov.reverse();
        int k=0;
        for(int i=0;i<res.length;i++){
            if(set.contains(res[i])){
                res[i] = vov.charAt(k++);
            }
        }
        return new String(res);
    }
}