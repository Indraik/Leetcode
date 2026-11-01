class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j = arr.length-1;
        while(i<j){
            if(i<j && Character.isLetter(arr[i]) && Character.isLetter(arr[j])){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(i<j && !Character.isLetter(arr[i])){
                i++;
            }
            else{
                j--;
            }
        }
        return new String(arr);
    }
}