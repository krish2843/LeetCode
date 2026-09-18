class Solution {
    public int kthFactor(int n, int k) {
        int[] nums= new int[n+1];
        int count=0;
        for(int i =1;i<=n;i++){
            if(n%i==0){
                nums[count]=i;
                count++;
            }
        }
        for(int i=0;i<count;i++){
            if(i==k-1){
                return nums[i];
            }
        }return -1; 
    }
}