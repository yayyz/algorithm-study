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
        // iteration solution: 
        // traverse first & add to ArrayList
        ListNode ptr = head;
        List<Integer> list = new ArrayList<Integer>();
        while(ptr != null) {
            list.add(0, ptr.val);
            ptr = ptr.next;
        }

        ptr = head;
        for(int num: list) {
            ptr.val = num;
            ptr = ptr.next;            
        }
        return head;
    }
}