/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode, Integer> nodeMap = new HashMap<ListNode, Integer>();
        nodeMap.put(head, 0);

        // check what's next 
        while(head != null && head.next != null) {
            if (!nodeMap.containsKey(head.next)) {
                nodeMap.put(head.next,0);
            } else { // if head.next is in the map -> cycle found! 
                return head.next;
            }
            head = head.next;
        }
        return null;
    }
}