package com.pokerbean.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * created by IntelliJ IDEA
 *
 * @author: pokerbean
 * @e-mail: brutalmraz@gmail.com
 * @time: 2018/8/4 16:27
 * @desc: getMaxLenthOfSubStr
 */
public class getMaxLenthOfSubStr {
    public static void main(String[] args) {
        int max = getMax("bdsaniiwahdajijiaw");
        System.out.println(max);

    }


    public static int getMax(String str){
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
}
