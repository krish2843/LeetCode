class Solution {
    public int romanToInt(String s) {
           int total=0;
           for(int i = s.length()-1;i>=0;i--){
             if(i<s.length()-1&&value(s.charAt(i))<value(s.charAt(i+1))){
                total-=value(s.charAt(i));
            }else{
                total+=value(s.charAt(i));
            }
           }
           return total;
    }
    public int value(char c){
        switch(c){
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default : return 0;
        }
    }
}