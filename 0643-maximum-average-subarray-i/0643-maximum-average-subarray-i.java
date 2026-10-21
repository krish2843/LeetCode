class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum =0;
        double maxsum=0;
        for(int i =0;i<k;i++){
            sum+=nums[i];
        }
        maxsum=sum;
        for(int i =k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum/k;

    }
}