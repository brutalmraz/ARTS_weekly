package com.pokerbean.leetcode.listnode;

/**
 * created by IntelliJ IDEA
 *
 * @author: pokerbean
 * @e-mail: brutalmraz@gmail.com
 * @time: 2018/10/4 20:54
 * @desc: InterSectionNode
 */
public class InterSectionNode {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNod2 = new ListNode(1);
        System.out.println(listNod2.val==listNode.val);

    }

    public  ListNode getIntersectionNode( ListNode headA, ListNode headB) {

        if(headA==null || headB==null) {
            return null;
        }

        ListNode p = headA;
        ListNode q = headB;
        int pcount = 0;
        int qcount = 0;
        while(p.next != null || q.next != null) {
            if(p == q) {
                return p;
            }
            if(p.next != null) {
                p = p.next;
            }else{
                ++qcount;
            }
            if(q.next != null){
                q = q.next; 
            } else {
                ++pcount;
            }
        }
        if(p != q){ 
            return null;
        }
        p = headA;
        q = headB;
        while(pcount-- != 0) {
            p=p.next;
        }

        while(qcount-- != 0) {
            q=q.next;
        }

        while(p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }


}
