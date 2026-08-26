class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }if(n==4){
            return false;
        }
    int lastd;
    int result=0;
    while(n>0){
        lastd=n%10;
        result+=lastd*lastd;
        n/=10;
    }
    if(result==1){
        return true;
    }
    while(result!=1 && result!=4){
        int sum=0;
        while(result>0){
            lastd=result%10;
            sum+=lastd*lastd;
            result/=10;
        }
        result=sum;
    }
    return result==1;
    }
}