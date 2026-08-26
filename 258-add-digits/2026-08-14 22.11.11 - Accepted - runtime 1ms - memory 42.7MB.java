class Solution {
    public int addDigits(int num) {
        int lastd;
        int result;
            lastd=num%10;
            num=(int)num/10;
            result=lastd+num;
            if(result<=9){
                return result;
        } else{
               while(result>9){
            lastd=result%10;
            result=result/10;
            result=lastd+result;
               }
            return result;
        }
    }
}