class Solution {
    public boolean isPowerOfFour(int n) {
        int pow;
        for(pow=0;pow<=30;pow++){
            if(n==Math.pow(4,pow)){
                return true;
            }
        } return false;
    }
}