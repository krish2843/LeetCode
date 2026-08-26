class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
      boolean duplicate=false;
      int i =1;
      while(i<nums.length){
        if(nums[i]==nums[i-1]){
            duplicate=true;
        
        }
        i++;
      }
      return duplicate;
    }
}