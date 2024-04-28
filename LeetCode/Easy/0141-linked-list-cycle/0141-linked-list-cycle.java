/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;ㅆ
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // create a dictionary for value-index 
        HashMap<Integer, Integer> valueMap = new HashMap<Integer, Integer>();
        while(head != null) {
            if (valueMap.containsKey(head.hashCode())) {
                return true;
            }
            valueMap.put(head.hashCode(), 0);
            head = head.next;
        }
        return false;
    }
}