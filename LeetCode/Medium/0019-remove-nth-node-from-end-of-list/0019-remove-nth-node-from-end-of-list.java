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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr = head;
        int pos = 0;
        if (head == null || head.next == null && n == 1) return null;

        while(ptr != null) {
            ptr = ptr.next;
            pos++;
        }

        // find the one node before nth position
        pos = pos - n;
        ptr = head;
        for (int i = 1; i < pos; i++) {
            ptr = ptr.next;
        }
        System.out.println(ptr.val);

        if (pos == 0) { // remove the head node
            head = head.next;
        } else {
            ptr.next = ptr.next.next;
        }
        return head;       
    }
}