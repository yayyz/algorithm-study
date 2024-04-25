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
    // there should be a better approach.... :( 
    public ListNode middleNode(ListNode head) {
        // make them point to the start 
        ListNode tail = head;
        ListNode mid = head;

        while(tail != null && tail.next != null) {
            mid = mid.next;
            tail = tail.next.next;
        }

        return mid;
    }
}