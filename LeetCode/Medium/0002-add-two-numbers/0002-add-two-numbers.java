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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode sumList = new ListNode(); // sum값을 담을 새로운 linked list 
        ListNode ptr = sumList;
        int add = 0; // 이전 digit 에서 10 이상의 수가 나온 경우 
    
        while(l1 != null || l2 != null || add != 0) {
            int sum = add > 0 ? add : 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum >= 10) {
                add = 1; 
            } else {
                add = 0;
            }

            sum %= 10;

            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }

        return sumList.next;
    }
}