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
        int size = 0;
        ListNode ptr = head;
        while (ptr != null) {
            size++;
            ptr = ptr.next;
        }    
        
        int pos = size / 2;

        for(int i = 1; i <= pos; i++) {
            head = head.next;
        }
        return head;
    }
}