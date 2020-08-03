package com.wenhx.leetcode.L_201910;

/**
 * @author: wenhx
 * @date: Created in 2019/10/1 23:03
 * @description: LeetCode_206：反转链表
 * @level: simple
 * @status: finish
 * @version: $1.0
 */
class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class LeetCode_206 {

    /**
     * 反转单链表
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        ListNode t1 = head.next;
        t1.next = head;
        head.next = null;
        return node;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        LeetCode_206 leetCode_206 = new LeetCode_206();
        leetCode_206.reverseList(n1);
        ListNode p = n1;
        while (p!=null){
            System.out.println(p.val);
            p = p.next;
        }
    }

}
