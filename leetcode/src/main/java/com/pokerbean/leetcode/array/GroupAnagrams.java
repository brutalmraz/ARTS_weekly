package com.pokerbean.leetcode.array;

import java.util.*;

/**
 * @class: GroupAnagrams.java
 * @version: 1.0
 * @author: CM
 * @e-mail: chenmao@danlu.com
 * @date: 2018/7/25 16:04
 * Created By IntelliJ  IDEA
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"abc","bcs","jkl","bca","cbs"};
        groupAnagrams(strs);
    }


    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String,ArrayList<Integer>> marks = new HashMap<>();
        for (int i = 0; i <strs.length ; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String symbol = String.valueOf(chars);
            if (marks.size()<1) {
                ArrayList<Integer> indexs = new ArrayList<>();
                indexs.add(i);
                marks.put(symbol,indexs);
            }else {
                for (String key : marks.keySet()) {
                    if (key == null) {
                        
                    }
                }
            }


        }
        return null;
    }
}
