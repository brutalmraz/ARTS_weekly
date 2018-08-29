package com.pokerbean.leetcode.listnode;

/**
 * @class: AddTwoNums.java
 * @version: 1.0
 * @author: CM
 * @e-mail: chenmao@danlu.com
 * @date: 2018/8/27 20:11
 * Created By IntelliJ  IDEA
 */
public class AddTwoNums {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public ListNode() {
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        ListNode n11 = new ListNode(2);
        ListNode n12 = new ListNode(4);
        ListNode n13 = new ListNode(3);
        n11.next=n12;
        n12.next=n13;
        ListNode n21 = new ListNode(5);
        ListNode n22 = new ListNode(6);
        ListNode n23 = new ListNode(4);
        n21.next=n22;
        n22.next=n23;
        ListNode result = addTwoNumbers(n11, n12);
        System.out.println(result);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num = 1;

        ListNode rst = new ListNode();
        ListNode nowNode = rst;

        boolean add =false;

        ListNode now1 = l1;
        ListNode now2 = l2;
        while (now1.next!=null){
            int r = now1.val + now2.val;
            if (add) {
                r = now1.val + now2.val + 1;
            }
            if (r>=10) {
                nowNode.val = r-10;
                add = true;
            }else {
                nowNode.val = r;
            }
            now1 = l1.next;
            now2 = l2.next;

            nowNode.next=new ListNode();
            nowNode =nowNode.next;
        }

        return null;
    }






}
