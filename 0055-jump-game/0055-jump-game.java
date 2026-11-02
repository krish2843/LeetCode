class Solution {
    public boolean canJump(int[] nums) {
    int maxreach=0;
    for(int i =0;i<nums.length;i++){
        if(i>maxreach){
            return false;
        }
        int reach = i + nums[i];
        maxreach=Math.max(maxreach,reach);
    }
    return true;
    }
}