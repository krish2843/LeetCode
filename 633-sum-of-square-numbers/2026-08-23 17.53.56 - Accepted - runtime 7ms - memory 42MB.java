class Solution {
    public boolean judgeSquareSum(int c) {
        
        int start=0;
        int end=(int)Math.sqrt(c);
        int sum=(int)(Math.pow(start,2)+Math.pow(end,2));
        while(start<=end){
            if(c==sum){
                return true;
            } else if(sum>c){
                end--;
            } else if(sum<c){
                start++;
            }
             sum=(int)(Math.pow(start,2)+Math.pow(end,2));
        }
        return false;


    }
}