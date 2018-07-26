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
        String[] strs = {"abc","mwws","bcs","jkl","bca","cbs"};
        List<List<String>> lists = groupAnagrams2(strs);
        System.out.println(lists);
    }


    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> arrayLists = new ArrayList<>();
        ArrayList<String> symbolList = new ArrayList<>();

        for (int i = 0; i <strs.length ; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String symbol = String.valueOf(chars);
            if (symbolList.size()==0) {
                symbolList.add(symbol);
            }else if (!symbolList.contains(symbol)) {
                symbolList.add(symbol);
            }

        }

        for (String symbol : symbolList) {
            List<String> resultList = new ArrayList<>();
            for (int i = 0; i <strs.length ; i++) {
                char[] chars = strs[i].toCharArray();
                Arrays.sort(chars);
                String mark = String.valueOf(chars);
                if (mark.equals(symbol)) {
                    resultList.add(strs[i]);
                }

            }
            arrayLists.add(resultList);
        }
        return arrayLists;
    }


    public static List<List<String>> groupAnagrams2(String[] strs) {
        if (strs.length==0) {
           return new ArrayList<List<String>>();
        }

        Map<String, List<String>> resultMap = new HashMap<>();
        for (int i = 0; i <strs.length ; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!resultMap.containsKey(key)) {
                List<String> arrayList = new ArrayList<>();
                arrayList.add(strs[i]);
                resultMap.put(key,arrayList);
            }else {
                List<String> stringList = resultMap.get(key);
                stringList.add(strs[i]);
                resultMap.put(key,stringList);
            }

        }
//        Set<String> keySet = resultMap.keySet();
//        List<List<String>> result = new ArrayList<>();
//        for (String key : keySet) {
//            result.add(resultMap.get(key));
//        }
        return new ArrayList<>(resultMap.values());
    }


}
