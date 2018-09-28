package com.pokerbean.leetcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeetcodeApplication.class, args);
    }


    public  ListNode addTwo(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode temp = sum;

        int i = 0;
        while (l1 != null || l2 != null || i != 0) {
            if (l1 == null) {
                l1 = new ListNode(0);
            }
            if (l2 == null) {
                l2 = new ListNode(0);
            }
            if (sum == null) {
                sum = new ListNode(0);
            }


            if (l1.val+l2.val<10) {
                sum.next = new ListNode( l1.val + l2.val + i);
                i = 0;
                sum = sum.next;
            }else  {
                sum.next = new ListNode(l1.val + l2.val+1 - 10);
                i = 1;
                sum = sum.next;
            }
            l1 = l1.next;
            l2 = l2.next;

        }

        return temp.next;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
