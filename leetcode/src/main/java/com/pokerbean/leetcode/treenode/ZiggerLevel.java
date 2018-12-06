package com.pokerbean.leetcode.treenode;

import java.util.*;

/**
 * created by IntelliJ IDEA
 *
 * @author:
 * pokerbean
 * @e-mail: brutalmraz@gmail.com
 * @time: 2018/11/27 09:54
 * @desc: ZiggerLevel
 */
public class ZiggerLevel {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        Queue<TreeNode> list = new LinkedList<>();
        list.offer(root);
        return null;
    }

    public static void main(String[] args) {
        new HashMap<>();

    }
}
