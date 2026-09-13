class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target == 'z'){
            return letters[0];
        }
        for(int i=0;i<letters.length;i++){
            if(letters[i] > target){
                return letters[i];
            }
        }
        return letters[0];
    }
}