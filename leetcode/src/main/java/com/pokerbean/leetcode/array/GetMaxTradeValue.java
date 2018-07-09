package com.pokerbean.leetcode.array;

/**
 * created by IntelliJ IDEA
 *
 * @author: pokerbean
 * @e-mail: brutalmraz@gmail.com
 * @time: 2018/6/23 上午12:27
 * @desc: GetMaxTradeValue
 */
public class GetMaxTradeValue {
    public static void main(String[] args) {
        int[] prices ={7,1,5,3,6,4};
//        int[] prices ={1,2,3,4,5};
        System.out.println(getMaxProfits(prices));
    }

    public static int getMaxProfits(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int max = 0;
        while (i < prices.length && j < prices.length) {
            while (j < prices.length - 1 && prices[j] < prices[j + 1]) {
                j++;
            }

            max += prices[j] - prices[i];
            if (j == prices.length - 1) {
                break;
            }
            i=j+1;
            j=j+1;

        }
        return max;
    }
}
