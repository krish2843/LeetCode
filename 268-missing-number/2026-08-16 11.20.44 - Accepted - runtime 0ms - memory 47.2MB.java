class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int exp_sum=n*(n+1)/2;
        int act_sum=0;
        int miss;
        for(int i =0;i<=n-1;i++){
            act_sum+=nums[i];
        }
        miss=(exp_sum-act_sum);
        return miss;
    }
}