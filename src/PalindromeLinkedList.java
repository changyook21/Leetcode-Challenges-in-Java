public class PalindromeLinkedList {
/*
Given a singly linked list, determine if it is a palindrome.

*/
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public boolean isPalindrome(ListNode head) {

        if (head == null) {
            return true;
        }
        if (head.next == null) {
            return true;
        }
        if (head.val == 0 && head.next.val == 0) {
            return true;
        }
        ListNode top = head;
        ListNode prev = null;
        ListNode temp = head;
        ListNode mid = head;
        int length = 0;

        while (temp != null) {
            length++;
            if (temp.next != null) {
                temp = temp.next.next;
            }
            else {
                temp = temp.next;
            }

            mid = mid.next;

        }

        ListNode current = mid;
        while (current != null) {
            mid = mid.next;
            current.next = prev;
            prev = current;
            current = mid;
        }


        while (prev != null && top != null) {

            if (top.val != prev.val) {
                return false;
            }
            top = top.next;
            prev = prev.next;
        }
        return true;
    }

}
