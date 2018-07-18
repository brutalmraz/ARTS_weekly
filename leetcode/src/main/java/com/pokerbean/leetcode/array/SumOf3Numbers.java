package com.pokerbean.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        int[] nums = {-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0};
        List<List<Integer>> lists = threeSum2(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


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
                        List<Integer> sums = new ArrayList<>();
                        if (sumsList.size() == 0) {
                            sums.add(nums[i]);
                            sums.add(nums[j]);
                            sums.add(nums[k]);
                            Collections.sort(sums);
                            sumsList.add(sums);
                        } else {
                            List<Integer> checkList = Arrays.asList(nums[i], nums[j], nums[k]);
                            for (List<Integer> integers : sumsList) {
                                Collections.sort(integers);
                                Collections.sort(checkList);
                                if ((int) integers.get(0) == (int) checkList.get(0)
                                        && (int) integers.get(1) == (int) checkList.get(1)
                                        && (int) integers.get(2) == (int) checkList.get(2)
                                        ) {
                                    removeFlag = true;
                                }
                            }
                            if (!removeFlag) {
                                sums.add(nums[i]);
                                sums.add(nums[j]);
                                sums.add(nums[k]);
                                Collections.sort(sums);
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

    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> sumsList = new ArrayList<>();
        if (nums.length<=2) {
            return sumsList;
        }
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]>0) {
                break;
            }
            if ( i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            int begin = i+1;
            int end = nums.length-1;
            while (begin<end){
                int sum = nums[i]+nums[begin]+nums[end];
                if (sum == 0) {
                    List<Integer> numList = new ArrayList<>();
                        numList.add(nums[i]);
                        numList.add(nums[begin]);
                        numList.add(nums[end]);
                        sumsList.add(numList);
                        begin++;
                        end--;
                        while (begin<end&&nums[begin]==nums[begin-1]) {
                            begin++;
                        }
                        while (begin<end&&nums[end]==nums[end+1]) {
                            end--;
                        }
                }else if (sum>0) {
                    end --;
                }else {
                    begin++;
                }
            }

        }
        return sumsList;
    }

}