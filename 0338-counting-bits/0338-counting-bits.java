class Solution {
    public int[] countBits(int n) {
        int [] ans =new int[n+1]; 
        int k =1;
        ans[0]=0;
        for(int i =1;i<=n;i++){
            int count=0;
            int temp =i;
            while(temp>0){
                if((temp&1)!=0){
                    count++;
                }
                temp=temp>>1;
            }
            ans[k]=count;
            k++;
        }
        return ans;
    }
}