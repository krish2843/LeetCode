class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }if(n<=0){
            return false;
        }
        for(int x=0;x<=30;x++){
        if(Math.pow(3,x)==n){
            return true;
        }
        }return false;
    }
}