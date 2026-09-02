class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        int lastd;
        while(n>0){
            lastd=n%10;
            product*=lastd;
            sum+=lastd;
            n/=10;
        }
        return product-sum;
        
    }
}