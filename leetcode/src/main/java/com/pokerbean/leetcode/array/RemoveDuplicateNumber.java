package com.pokerbean.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * created by IntelliJ IDEA
 *
 * @author: pokerbean
 * @e-mail: brutalmraz@gmail.com
 * @time: 2018/6/22 下午11:34
 * @desc: RemoveDuplicateNumber
 */
public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,1,1,2,3,4};
        int i = removeDuplicates(array);
        System.out.println(i);
        String json= "{\"code\":\"0010001101\"}";
    }

    private static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        List<Integer> resultList= new ArrayList<>();
        int last= 0;
        for (int i = 0; i <nums.length ; i++) {
            if (!resultList.contains(nums[i])) {
                resultList.add(nums[i]);
                nums[resultList.size()-1]=nums[i];
                last =i+1;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums,0,last)));
        return resultList.size();
    }
}
