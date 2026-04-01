package org;

public class Main {
    public static void main(String[] args) {
        int[] prices = new int[] {7,2,4,1,3,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        int pL = 0;
        int pR = 1;

        while(pR < prices.length){
            if(prices[pL] < prices[pR]){
                maxProfit = Math.max(maxProfit,prices[pR]-prices[pL]);
            }else{
                pL = pR;
            }

            pR++;
        }
        return maxProfit;
    }
}