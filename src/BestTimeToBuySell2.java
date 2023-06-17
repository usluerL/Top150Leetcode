public class BestTimeToBuySell2 {

                    /*
Problem No: 122
Problem Title: Best Time to Buy and Sell Stock2
Difficulty: Medium
URL: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150

Trick: Always keep the sell price, since same day operation allowed. Profit if it is bigger!

                 */


    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int sell = prices[0];
        int length = prices.length;
        if (length < 2) return 0;

        for (int i = 1; i < length; i++) {
            if (prices[i] >= sell) {
                maxProfit += prices[i] - sell;
            }
            sell = prices[i];
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        BestTimeToBuySell2 timeToBuySell = new BestTimeToBuySell2();

        int [] arr = {4,8,9,2,3};

        System.out.println(timeToBuySell.maxProfit(arr));
    }

}


