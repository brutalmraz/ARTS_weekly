package com.pokerbean.leetcode.listnode;

/**
 * created by IntelliJ IDEA  奇偶链表
 *
 * @author: pokerbean
 * @e-mail: brutalmraz@gmail.com
 * @time: 2018/10/2 16:09
 * @desc: OddEvenNodes
 */
public class OddEvenNodes {


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


    public static ListNode oddEvenList(ListNode head) {

        if (head== null|| head.next ==null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;

        ListNode t = even;

        while (null!=odd.next&&null!=even.next){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = t ;
        return  head ;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=l7;

        ListNode listNode = oddEvenList(l1);
        System.out.print(listNode);
    }


}
