class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []nums1= new int[nums.length];
        int negidx=1;
        int postidx=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]<0){
                nums1[negidx]=nums[i];
                negidx+=2;
            }
            if(nums[i]>0){
                nums1[postidx]=nums[i];
                postidx+=2;
            }
        }
        return nums1;
        
    }
}