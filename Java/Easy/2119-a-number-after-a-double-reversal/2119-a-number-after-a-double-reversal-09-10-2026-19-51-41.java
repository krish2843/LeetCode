class Solution {
    public boolean isSameAfterReversals(int num) {
        int lastd=num%10;
    if(num==0|| lastd!=0){
        return true;
    }
    return false;   
    }
}