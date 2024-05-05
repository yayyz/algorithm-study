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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
       
        // create a node where it always points to the first node of the list 
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;

        while(curr != null && curr.next != null) {
            ListNode nextPair = curr.next.next;
            ListNode n2 = curr.next;

            n2.next = curr; 
            curr.next = nextPair;
            prev.next = n2;

            prev = curr;
            curr = nextPair;
        }

        return dummy.next;
    }
}