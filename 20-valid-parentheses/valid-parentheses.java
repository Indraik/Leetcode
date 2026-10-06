class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                if(ch == ']' || ch == '}' || ch == ')'){
                    return false;
                }
            } 
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(ch == ')' && st.peek() == '('){
                st.pop();
            }
            else if(ch == '}' && st.peek() == '{'){
                st.pop();
            }
            else if(ch == ']' && st.peek() == '['){
                st.pop();
            }
            else {
                return false;
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}