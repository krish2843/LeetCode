class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        for(int pow=0;pow<=30;pow++){
            if(Math.pow(2,pow)==n){
                return true;
                
            }
        }
        return false;
    }
}