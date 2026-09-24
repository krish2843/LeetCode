class Solution {
    public int smallestIndex(int[] nums) {
        for(int i =0;i<nums.length;i++){
            int digitsum=0;
            int n=nums[i];
            while(n>0){
                int lastd=n%10;
                digitsum=digitsum+lastd;
                n/=10;
            }
            if(digitsum==i){
                return i;
            }
        }
        return -1;
    }
}