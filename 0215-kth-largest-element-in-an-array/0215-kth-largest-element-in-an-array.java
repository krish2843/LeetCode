class Solution {
    public int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);
    int a=0;
    for(int i =nums.length-1;i>=0;i--){
        a++;
        if(a==k){
            return nums[i];
        }
    }
    return -1;
    }
}