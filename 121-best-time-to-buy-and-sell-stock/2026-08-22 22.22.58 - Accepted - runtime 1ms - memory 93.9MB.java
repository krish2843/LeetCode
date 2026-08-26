class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int max=0;
        int profit;
        for (int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                profit=prices[i]-buy;
                max =Math.max(profit, max);
            }else{
                buy=prices[i];
            }
        } return max;
    }
}