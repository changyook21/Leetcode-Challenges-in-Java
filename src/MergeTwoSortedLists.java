public class MergeTwoSortedLists {
/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

*/
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode merged;
        if (l1.val <= l2 .val) {
            merged= l1;
            l1 = l1.next;
        }
        else {
            merged = l2;
            l2 = l2.next;
        }
        ListNode pointer = merged;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                pointer.next = l1;
                l1 = l1.next;
            }
            else {
                pointer.next = l2;
                l2 = l2.next;
            }
            pointer = pointer.next;
        }

        while (l1 != null) {
            pointer.next = l1;
            l1 = l1.next;
            pointer = pointer.next;
        }

        while (l2 != null) {
            pointer.next = l2;
            l2 = l2.next;
            pointer = pointer.next;
        }
        return merged;
    }

}
