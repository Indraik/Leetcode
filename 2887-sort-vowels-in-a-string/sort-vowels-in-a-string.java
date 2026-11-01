class Solution {
    public String sortVowels(String s) {
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
        StringBuilder vov = new StringBuilder();
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                vov.append(c);
            }
        }
        char[] temp = s.toCharArray();
        char[] arr = vov.toString().toCharArray();
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<temp.length;i++){
            if(set.contains(temp[i])){
                temp[i] = arr[j++];
            }
        }
        return new String(temp);
    }
}