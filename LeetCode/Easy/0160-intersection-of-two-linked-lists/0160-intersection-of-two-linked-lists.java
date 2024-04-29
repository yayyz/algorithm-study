/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<Integer, Integer> aMap = new HashMap<Integer,Integer>();
        HashMap<Integer, Integer> bMap = new HashMap<Integer,Integer>();
        ListNode ptr = headA;
        while(ptr != null) {
            aMap.put(ptr.hashCode(), 0);
            ptr = ptr.next;
        }
        ptr = headB;
        while(ptr != null) {
            bMap.put(ptr.hashCode(), 0);
            ptr = ptr.next;
        }

        ptr = headA;
        while(ptr != null) {
            if (bMap.containsKey(ptr.hashCode())) {
                return ptr;
            }
            ptr = ptr.next;
        }

        ptr = headB;
        while(ptr != null) {
            if(aMap.containsKey(ptr.hashCode())) {
                return ptr;
            }
            ptr = ptr.next;
        }
        return null;
    }
}