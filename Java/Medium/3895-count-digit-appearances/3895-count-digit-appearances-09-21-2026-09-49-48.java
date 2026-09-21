class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int d=0;
        for(int i =0;i<nums.length;i++){
            int x= nums[i];
            while(x>0){
                int lastd=x%10;
                if(lastd==digit){
                    d++;
                }
                x/=10;
            }
        }
        return d;
    }
}