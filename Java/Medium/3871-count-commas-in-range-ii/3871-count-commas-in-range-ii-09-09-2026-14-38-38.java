class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        long total=0;
        long min=1000;
        while(n>=min){
            total+=n-min+1;
            min*=1000;
        }
        return total;
    }
}