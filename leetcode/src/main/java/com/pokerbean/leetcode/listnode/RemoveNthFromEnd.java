package com.pokerbean.leetcode.listnode;

/**
 * @class: RemoveNthFromEnd.java
 * @version: 1.0
 * @author: CM
 * @e-mail: chenmao@danlu.com
 * @date: 2019/1/11 17:45
 * Created By IntelliJ  IDEA
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null || head.next ==null) {
            return null;
        }
        ListNode pre = head;
        ListNode last = head;
        for (int i = 0; i <n ; i++) {
            last = last.next;
        }
        if (last == null) {
            return pre.next;
        }        
        while (last.next!=null){
            last = last.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
