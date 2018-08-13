package com.pokerbean.leetcode.array;

/**
 * @class: LongestPalindrome.java
 * @version: 1.0
 * @author: CM
 * @e-mail: chenmao@danlu.com
 * @date: 2018/8/13 13:55
 * Created By IntelliJ  IDEA
 */
public class LongestPalindrome {
    public static void main(String[] args) {

        String s = longestPalindrome("dbaabd23");
        System.out.println(s);
    }

    private static String longestPalindrome(String origStr){
        if (origStr.length()<=1) {
            return origStr;
        }
        char[] chars = origStr.toCharArray();
        String longest = "";
        for (int i = 0; i <chars.length-1 ; i++) {
            String self = getPalindrome(origStr, i, i);

            if (self.length()>longest.length()) {
                longest = self;
            }
            String result = getPalindrome(origStr, i, i + 1);
            if (result.length()>longest.length()) {
                longest = result;
            }
        }

        return longest;
    }

    private static String getPalindrome(String str ,int left,int right){

        int n = str.length();
        int l = left;
        int r = right;

        while (l>=0&&r<=n-1&&str.charAt(l)==str.charAt(r)){
            l--;
            r++;
        }
        return str.substring(l+1,r);
    }
}
