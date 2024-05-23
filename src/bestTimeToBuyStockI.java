public class bestTimeToBuyStockI {
    /* this is two pointer approach */
    // public static int maxProfit(int[] prices) {
    //     int maxTotal = 0;
    //     int l = 0;
    //     int r = 1;
    //     while (r < prices.length) {
    //         if (prices[l] < prices[r]) {
    //             int total = prices[r] - prices[l];
    //             if (maxTotal < total) {
    //                 maxTotal = total;
    //             }
    //             r++;
    //         } else {
    //             l++;
    //             r = l + 1;
    //         }
    //     }
    //     return maxTotal;
    // }
    
    /*Mathematical approach */
    public static int maxProfit(int[] prices) {
        int maxTotal = 0;
        int minToBuy = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < minToBuy){
                minToBuy = prices[i];
            }
            int price = prices[i] - minToBuy;
            if(price > maxTotal){
                maxTotal = price;
            }
        }
        return maxTotal;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] { 1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9 }));
    }
}
