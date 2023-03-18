package com.company.problem_solving;

public class BestTimeAndSell {

    public static void main(String[] args) {

        int prices[] = {7,1,5,4,2,10};
        System.out.println("Max Profit "+maxProfit(prices));
        System.out.println("Max Profit "+maxProfit2(prices));
        System.out.println("Max Profit "+maxProfit3(prices));
        System.out.println("Max Profit "+maxProfit4(prices));

    }
    public static int maxProfit(int[] prices) {
        /***
         * Time Complexity O(n^2)
         */

        int price = 0 ;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i]<prices[j]){
                    price = Math.max(price,prices[j] - prices[i]);
                }

            }
        }

        return  price;
    }
    public  static  int maxProfit2(int[] prices ){
        /***
         * Time Complexity O(n)
         */
        int maxProfit =0;
        int left = 0;
        int right = 1 ;
       while (right<prices.length){
            if (prices[left]<prices[right]) {
                maxProfit =  Math.max(prices[right] - prices[left] , maxProfit);
            } else {
                left = right;
            }
            right++;
        }
        return  maxProfit;
    }
     public  static  int maxProfit3(int[] prices ){
        /***
         * Time Complexity O(n)
         */
        int maxProfit =0;
       int currentProfit = 0 ;
       int minStock = prices[0];
         for (int i = 0; i < prices.length; i++) {

             minStock = Math.min(minStock,prices[i]);
             currentProfit = prices[i] - minStock;
             maxProfit = Math.max(maxProfit,currentProfit);
         }
        return  maxProfit;
    }
    public static  int maxProfit4(int[] prices){
        int buy = prices[0];
        int sell = 0 ;
        for (int i = 0; i < prices.length; i++) {
            buy  = Math.min(prices[i],buy);
            sell = Math.max(sell , prices[i] - buy);
        }
        return  sell;
    }
}
