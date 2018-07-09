package com.pokerbean.leetcode.array;

import java.util.*;

/**
 * @class: SumOf3Numbers.java
 * @version: 1.0
 * @author: CM
 * @e-mail: chenmao@danlu.com
 * @date: 2018/7/9 16:02
 * Created By IntelliJ  IDEA
 */
public class SumOf3Numbers {
    public static void main(String[] args) {
        int[] nums = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> sumsList = new ArrayList<>();
        if (nums == null || nums.length <= 2) {
            return sumsList;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int k = j + 1;
                while (k < nums.length) {
                    int sum = nums[i] + (nums[j]) + (nums[k]);
                    if (sum == 0) {
                        boolean removeFlag = false;
                        if (sumsList.size()==0) {
                            List<Integer> sums = new ArrayList<>();
                            sums.add(nums[i]);
                            sums.add(nums[j]);
                            sums.add(nums[k]);
                            sumsList.add(sums);
                        }else {
                            for (List<Integer> integers : sumsList) {
                                ArrayList<Integer> numbers = new ArrayList<>();

                                if (integers.contains(nums[i])){
                                    integers.remove(nums[i]);
                                }
                                if (integers.contains(nums[j])){
                                    integers.remove(nums[j]);
                                }
                                if (integers.contains(nums[k])){
                                    integers.remove(nums[k]);
                                }
                                if (integers.size()==0) {
                                    removeFlag = true;
                                }
                            }
                            if (!removeFlag) {
                                List<Integer> sums = new ArrayList<>();
                                sums.add(nums[i]);
                                sums.add(nums[j]);
                                sums.add(nums[k]);
                                sumsList.add(sums);
                            }
                        }
                    }
                    k++;
                }
            }
        }
        return sumsList;

    }
}
