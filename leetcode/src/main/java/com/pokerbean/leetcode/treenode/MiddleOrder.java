package com.pokerbean.leetcode.treenode;

import java.util.ArrayList;
import java.util.List;

/**
 * created by IntelliJ IDEA
 *
 * @author: pokerbean
 * @e-mail: brutalmraz@gmail.com
 * @time: 2018/11/1 23:45
 * @desc: MiddleOrder
 */
public class MiddleOrder {

    List<Integer> results = new ArrayList<>();



    public List<Integer> inOrderTraversal(TreeNode node) {

        if (node == null) {
            return results;
        } else {
            inOrderTraversal(node.left);
            results.add(node.val);
            inOrderTraversal(node.right);
        }
        return results;
    }


}
