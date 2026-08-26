class Solution {
    public void reverseString(char[] s) {
       int start=0;
       int end=s.length-1;
       while(start<=end){
        int temp;
        temp = s[start];
        s[start]=(char)s[end];
        s[end]=(char)temp;
        start++;
        end--;
        }
    }
}