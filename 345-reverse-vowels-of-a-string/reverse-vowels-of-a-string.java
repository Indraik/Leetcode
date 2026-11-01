class Solution {
    public String reverseVowels(String s) {
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
        
        char[] res = s.toCharArray();
        int i=0;
        int j=res.length-1;
        while(i<j){
            while(i<j && !set.contains(res[i])){
                i++;
            }
            while(i<j && !set.contains(res[j])){
                j--;
            }
            char temp = res[i];
            res[i] = res[j];
            res[j] = temp;
            i++;
            j--;
        }

        return new String(res);
    }
}