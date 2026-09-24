class Solution {
    public int integerReplacement(int n) {
        long a=n;
        int count=0;
        while(a!=1){
            if(a%2==0){
                a/=2;
            } else if(a==3 || a%4==1){
                a=a-1;
            } else{
                a=a+1;
            }
         count++;
        }
        return count;
        
    }
}