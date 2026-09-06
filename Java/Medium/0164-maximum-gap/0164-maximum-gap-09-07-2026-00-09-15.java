class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        int differnce;
        for(int i=1;i<nums.length;i++){
            differnce=nums[i]-nums[i-1];
            max=Math.max(differnce,max);
        }
            return max;
        
       
    } 
}