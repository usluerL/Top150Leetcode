public class BestTimeToBuySell {

                /*
Problem No: 121
Problem Title: Best Time to Buy and Sell Stock
Difficulty: Easy
URL: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150

Trick: Math.max, math.min functions, no need to check big-small etc.

                 */

    public int maxProfit(int[] prices) {

        int min = prices[0];
        int maxProfit = 0;
        int len = prices.length;
        if (len < 2) return 0;

        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        int [] arr = {8,4,3,2,3};

        BestTimeToBuySell buySell = new BestTimeToBuySell();

        System.out.println(buySell.maxProfit(arr));
    }
}
