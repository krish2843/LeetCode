class Solution {
    public int maxSubArray(int[] nums) {
        int cs =0;
        int mx=Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            cs+=nums[i];
            mx=Math.max(cs,mx);
            if(cs<0){
                cs=0;
            }
            
        }
        return mx;
    }
}