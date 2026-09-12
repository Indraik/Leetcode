class Solution {
    public int compress(char[] ch) {
        String str = "";
        if(ch.length == 1){
            return 1;
        }
        int count = 1;
        for(int i=1;i<ch.length;i++){
            if(ch[i-1] != ch[i]){
                str += ch[i-1];
                if(count != 1){
                    String temp = String.valueOf(count);
                    str += temp;
                }
                count = 1;
            }
            else if(ch[i-1] == ch[i]){
                count++;
            }
            if(i == ch.length-1){
                str += ch[i];
                if(count != 1){
                    String temp = String.valueOf(count);
                    str += temp;
                }
            }
        }
        int ans = str.length();
        for(int i=0;i<ans;i++){
            char chs = str.charAt(i);
            ch[i] = chs;
        }
        return ans;
    }
}