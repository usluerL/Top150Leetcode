public class BestTimeToBuySell2 {

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


