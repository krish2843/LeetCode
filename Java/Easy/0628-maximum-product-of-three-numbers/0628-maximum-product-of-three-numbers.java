class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product1;
        int product2;
        int n = nums.length;
        product1 = nums[n-1]*nums[n-2]*nums[n-3];
        product2=nums[0]*nums[1]*nums[n-1];
        return Math.max(product1,product2);
    }
}