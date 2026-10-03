class Solution {
    public String compressedString(String word) {
     StringBuilder sb= new StringBuilder("");
     for(int i =0;i<word.length();i++){
        int count=1;
        char ch= word.charAt(i);
        while(i<word.length()-1 && word.charAt(i)==word.charAt(i+1)&& count<9){
            count++;
            i++;
        }
        if(count>0){
            sb.append(count);
        }sb.append(ch);
     }
     return sb.toString();
    }
}