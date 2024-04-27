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
    // brute-force solution
    // 1. put node values into an ArrayList 
    // 2. sort the arraylist 
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1. put noe values into an arraylist 
        List<Integer> list = new ArrayList<Integer>();

        while(list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
        }
     
        // 2. sort the arraylist 
        Collections.sort(list);

        // // 3. create a new ListNode to return the value 
        ListNode ret = null;
        ListNode head = null;
        for(int num : list) {
            if (ret == null) {
                ret = new ListNode(num);
                head = ret;
                continue;
            } 
            ret.next = new ListNode(num);
            ret = ret.next;
        }

        return head;
    }
}