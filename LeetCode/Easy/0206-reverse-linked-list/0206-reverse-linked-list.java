/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // O(n) solution
        ListNode reversedList = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode next = curr.next;
            // re-assign the pointer to the "reversed list"
            curr.next = reversedList;
            reversedList = curr;
            // traverse the original list 
            curr = next;
        }
        return reversedList;
    }
}