package Algorithm;

public class BestTimetoBuyandSellStock {
    class Solution {
        public int maxProfit(int[] prices) {
            int profit=0;
            int temp=0;
            //int time=0;
            for(int i=0;i<prices.length;i++){
                for(int j=i;j<prices.length;j++){
                    temp=prices[j]-prices[i];
                    if(temp>profit){
                        profit=temp;
                        //time=j+1;
                    }
                }
            }
            return profit;
        }
    }
}
