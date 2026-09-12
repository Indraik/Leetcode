class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        String ans = "";
        int n = arr.length;
        System.out.println(n);
        for(int i=arr.length-1;i>=0;i--){
            if(i != 0){
                ans += arr[i]+" ";
            }
            else{
                ans += arr[i];
            }
            
        }
        return ans;
    }
}