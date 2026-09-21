class Solution {
    public int[][] generateMatrix(int n) {
        int [][]mat=new int[n][n];
        int startrow=0;
        int endrow=n-1;
        int startcol=0;
        int endcol=n-1;
        int num=1;
        while(startrow<=endrow && startcol<=endcol){
        //top
        for(int j=startcol;j<=endcol;j++){
            mat[startrow][j]=num;
            num++;
        }
        //left
        for(int i = startrow+1;i<=endrow;i++){
            mat[i][endcol]=num;
            num++;
        }
        // botton
        for(int j=endcol-1;j>=startcol;j--){
            if(startrow==endrow){
                break;
            }
            mat[endrow][j]=num;
            num++;
        }
        //right
        for(int i = endrow-1;i>=startrow+1;i--){
            if(startcol==endcol){
                break;
            }
          mat[i][startcol]=num;
          num++;
        }
        startrow++;
        endrow--;
        startcol++;
        endcol--;
        }
        return mat;
    }
}