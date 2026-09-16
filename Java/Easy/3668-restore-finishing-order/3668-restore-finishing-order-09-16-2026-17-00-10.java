class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int k =0;
        int []res=new int[friends.length];
        for(int i =0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    res[k]=friends[j];
                    k++;
                }
            }
        }return res;
        
    }
}