class Solution {
    public int numberOfSteps(int num) {
        return func(num,0);
    }
    static int func(int num,int count){
        if(num == 0){
            return count;
        }

        if(num % 2 == 0){
            return func(num/2,count+1);
        }
        
        return func(num-1,count+1);
    }
}