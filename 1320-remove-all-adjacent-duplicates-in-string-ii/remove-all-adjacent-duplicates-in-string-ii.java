class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> ch = new Stack<>();
        Stack<Integer> co = new Stack<>();

        for(char c: s.toCharArray()){
            if(!ch.isEmpty() && ch.peek() == c){
                co.push(co.peek()+1);
            }
            else{
                co.push(1);
            }
            ch.push(c);

            if(!co.isEmpty() && co.peek() == k){
                for(int i=0;i<k;i++){
                    ch.pop();
                    co.pop();
                }
            }
        }
        while(!ch.isEmpty()){
            sb.append(ch.pop());
        }
        return sb.reverse().toString();

    }
}