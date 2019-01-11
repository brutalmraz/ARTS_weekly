package com.pokerbean.leetcode.listnode;

/**
 * @class: DeleteNode.java
 * @version: 1.0
 * @author: CM
 * @e-mail: chenmao@danlu.com
 * @date: 2019/1/11 11:46
 * Created By IntelliJ  IDEA
 */
public class DeleteNode {

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
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        deleteNode(n3);
        System.out.println(head);
    }

    private static void deleteNode(ListNode removeNode){
        if (removeNode == null||null==removeNode .next) {
            return ;
        }
        ListNode next = removeNode.next;
        removeNode.next = next.next;
        removeNode.val = next.val;
    }


}
