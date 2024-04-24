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
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode ptr = head;
        while ( ptr != null) {
            length++;
            ptr = ptr.next;
        }
        ptr = head;
       int middleIndex = length / 2;
        for (int i = 0; i < middleIndex; i++) {
            ptr = ptr.next;
        }

        return ptr;
    }
}