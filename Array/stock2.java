package Array;

//buy and sell stock with no limit

class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int n=prices.length;
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1])profit+=(prices[i]-prices[i-1]);
        }
        return profit;
    }
}


//buy and sell stock at max 1 times
class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int n=prices.length;
        int mxprofit=0;
        int buying_price=prices[0];
        for(int i=1;i<n;i++){
            if(buying_price<prices[i]){
                int profit=prices[i]-buying_price;
                mxprofit=Math.max(mxprofit,profit);
            }else buying_price=prices[i];
        }
        return mxprofit;
    }
}