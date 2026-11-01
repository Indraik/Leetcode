class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            res.append(new StringBuilder(arr[i]).reverse());
            if(i < arr.length-1){
                res.append(" ");
            }
            
        }
        return res.toString();
    }
}