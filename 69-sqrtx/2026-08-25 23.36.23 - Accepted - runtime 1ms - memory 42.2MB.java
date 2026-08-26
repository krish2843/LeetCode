class Solution {
    public int mySqrt(int x) {
        
      if(x<2){
        return x;
      }
    
      long start=0;
      long end=x/2;
    
      while(start<=end){
        long mid=(start+end)/2;
        long sqre=mid*mid;
        if(sqre==x){
            return (int)mid;
        }else if(sqre<x){
            start=mid+1;
        }else if(sqre>x){
            end=mid-1;
        }
      
      } return (int)end;
    }
}