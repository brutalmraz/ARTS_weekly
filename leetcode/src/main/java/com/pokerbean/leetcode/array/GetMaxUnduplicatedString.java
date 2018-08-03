package com.pokerbean.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @class: GetMaxUnduplicatedString.java
 * @version: 1.0
 * @author: CM
 * @e-mail: chenmao@danlu.com
 * @date: 2018/8/2 9:45
 * Created By IntelliJ  IDEA
 */
public class GetMaxUnduplicatedString {
    public static void main(String[] args) {
        int i = getMaxUnduplicatedLength("dvdf");
        System.out.println(i);
    }

    public static String getMaxUnduplicatedString(String str){

        if(str.length()==0){
            return "";
        }

        List<String> list = new ArrayList<>();
        char[] chars = str.toCharArray();
        int lenth = 0;
        String maxString  ="";
        for (int i = 0; i <chars.length ; i++) {
            for (int j = i+1; j <chars.length ; j++) {
                String sub = str.substring(i, j);
                if (sub.contains(str.substring(j,j+1))) {
                    list.add(sub);
                    if (sub.length()>lenth) {
                        lenth =sub.length();
                        maxString =sub;
                    }
                    i=j-1;
                    break;
                }
                if (j==chars.length-1) {
                    String s = sub + chars[chars.length - 1];
                    if (s.length()>lenth) {
                        lenth =sub.length();
                        maxString =s;
                    }
                }
            }
        }
        return maxString;
    }

    public static int getMaxUnduplicatedLength(String str){
        if(str.length()<=1){
            return str.length();
        }

        List<String> list = new ArrayList<>();
        char[] chars = str.toCharArray();
        int lenth = 0;
        for (int i = 0; i <chars.length ; i++) {
            for (int j = i+1; j <chars.length ; j++) {
                String sub = str.substring(i, j);
                if (sub.contains(str.substring(j,j+1))) {
                    list.add(sub);
                    if (sub.length()>lenth) {
                        lenth =sub.length();
                    }
                    int index = sub.indexOf(str.substring(j, j + 1));
                    i+=index;
                    break;
                }
                if (j==chars.length-1) {
                    String s = sub + chars[chars.length - 1];
                    if (s.length()>lenth) {
                        lenth =sub.length()+1;
                    }
                }
            }
        }
        return lenth;
    }

//    public static int getMaxLen(String str){
//        int n = str.length();
//        for (int i = 0,j= 0; j < n; j++) {
//            Math.max(str.charAt(j),i);
//
//        }
//    }

}
