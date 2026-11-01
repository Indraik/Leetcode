class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '#'){
                if(!s1.isEmpty()){
                    s1.pop();
                }
                else{
                    continue;
                }
            }
            else{
                s1.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!s1.isEmpty()){
            sb.append(s1.pop());
        }
        sb.reverse();
        String ans = sb.toString();

        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == '#'){
                if(!s2.isEmpty()){
                    s2.pop();
                }
                else{
                    continue;
                }
            }
            else{
                s2.push(t.charAt(i));
            }
        }
        StringBuilder sb1 = new StringBuilder();
        while(!s2.isEmpty()){
            sb1.append(s2.pop());
        }
        sb1.reverse();
        String ans1 = sb1.toString();
        return ans.equals(ans1);
       
    }
}