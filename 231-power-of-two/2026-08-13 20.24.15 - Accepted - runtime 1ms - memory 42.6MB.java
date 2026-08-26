class Solution {
    public boolean isPowerOfTwo(int n) {

        for(int pow=0;pow<=30;pow++){
            if(Math.pow(2,pow)==n){
                return true;
                
            }
        }
        return false;
    }
}