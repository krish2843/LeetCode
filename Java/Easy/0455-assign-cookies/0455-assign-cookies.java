class Solution {
    public int findContentChildren(int[] g, int[] s) {
       int cookie=0;
       Arrays.sort(g);
       Arrays.sort(s);
       int i =0;
       int j =0;
       while(i<g.length&&j<s.length){
       if(s[j]>=g[i]){
        cookie++;
        i++;
        j++;
       }else{
        j++;
          }
       }
          return cookie;
    }

}
