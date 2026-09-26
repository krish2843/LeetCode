class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []answer=new int [nums.length];
        int []prefix=new int [nums.length];
        int n =nums.length-1;
        prefix[0]=1;
        for(int i =1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        int [] suffix=new int [nums.length];
        suffix[n]=1;
        for(int i =n-1;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            answer[i]=prefix[i]*suffix[i];
        }   
        return answer;
    }
}