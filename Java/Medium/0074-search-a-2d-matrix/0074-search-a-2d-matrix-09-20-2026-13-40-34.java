class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int n = matrix.length;
      int m = matrix[0].length;
      int startrow=0;
      int endrow=n-1;
      while(startrow<=endrow){
        int midrow=startrow+(endrow-startrow)/2;
        if(matrix[midrow][0]<=target && target<=matrix[midrow][m-1]){
            int startcol=0;
            int endcol=m-1;
            while(startcol<=endcol){
                int midcol=startcol+(endcol-startcol)/2;
                if(matrix[midrow][midcol]==target){
                    return true;
                }
                else if (matrix[midrow][midcol]>target){
                    endcol=midcol-1;
                }else if(matrix[midrow][midcol]<target){
                    startcol=midcol+1;
                }
            }
            return false;
        }else if (matrix[midrow][0]>target){
            endrow=midrow-1;
        }else if(matrix[midrow][m-1]<target){
            startrow=midrow+1;
        }
      }
      return false;
    }
}