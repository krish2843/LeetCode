class Solution {
    public int countDigits(int num) {
        int x=num;
        int lastd;
        int count=0;
        while(x>0){
            lastd=x%10;
            if(num%lastd==0){
                count++;
            }x/=10;
        }
        return count;

    }
}