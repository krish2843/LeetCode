class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        int bit=0;
        for(int i =0;i<nums.length;i++){
            nums[i]=start+2*i;
            bit=bit^nums[i];
        }
        return bit;
    }
}