class Solution {
    public String largestGoodInteger(String num) {
          String result="";
        for(int i =1;i<num.length()-1;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i-1)){
                String current= num.substring(i-1,i+2);
               if( current.compareTo(result)>0){
                result=current;
               }   
          }
        }
        return result;
        
    }
}