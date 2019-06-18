public class ReverseLinkedList {
/*
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL

*/
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while ( current != null) {
            head = head.next;
            current.next = prev;
            prev = current;
            current = head;
        }
        return prev;


    }

}
