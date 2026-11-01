class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        StringBuilder ans = new StringBuilder();
        int n = arr.length;
        for(int i=arr.length-1;i>=0;i--){
            if(i != 0){
                ans.append(arr[i]+" ");
                // ans += arr[i]+" ";
            }
            else{
                ans.append(arr[i]);
                // ans += arr[i];
            }
            
        }
        return ans.toString();
    }
}