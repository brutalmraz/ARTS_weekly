package com.pokerbean.leetcode.array;

/**
 * created by IntelliJ IDEA
 *
 * @author: pokerbean
 * @e-mail: brutalmraz@gmail.com
 * @time: 2018/8/17 20:29
 * @desc: IncreasingTriplet
 */
public class IncreasingTriplet {

    public static void main(String[] args) {
        int[] nums = {16,5,7,4,5};
        boolean triplet = increasingTriplet(nums);
        System.out.println(triplet);

    }


    public static boolean increasingTriplet(int[] nums) {
        boolean result =false;

        for (int i = 0; i <nums.length-2 ; i++) {

            for (int j = i+1; j <nums.length-1 ; j++) {
                if (nums[i]>=nums[j]) {
                    continue;
                }
                for (int k = j+1; k <nums.length ; k++) {
                    if (nums[j]<nums[k]) {
                        return true;
                    }
                }

            }
        }
        return result;
    }

    public static boolean increasingTriplet2(int[] nums) {

        if (nums.length<3) {
            return false;
        }

        boolean result =false;
        int left =nums[0];
        int right = Integer.MAX_VALUE;
        for (int i = 1; i <nums.length; i++) {
            if (nums[i]>right) {
                return true;
            }
            if (nums[i]>left&&nums[i]<right) {
                right = nums[i];
            }
            if (nums[i]<left) {
                left = nums[i];
            }
        }
        return result;
    }


}
