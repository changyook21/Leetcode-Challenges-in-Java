public class RemoveNthNodeFromEndOfList {
/*
Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
*/
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next ==null) {
            return null;
        }
        ListNode current = head;
        ListNode remove = head;
        ListNode prev = null;
        int count = n;
        while(count != 0) {
            current = current.next;
            count--;
        }
        while (current != null) {
            current = current.next;
            prev = remove;
            remove = remove.next;
        }
        if (remove == head) {
            head = head.next;
            return head;
        }
        prev.next = remove.next;
        return head;
    }
}

