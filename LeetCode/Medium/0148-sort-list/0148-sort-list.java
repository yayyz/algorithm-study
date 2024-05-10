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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode left = head; 
        ListNode right = getMid(head);

        // middle 보다 이전의 node가 나옴!
        // left와 right의 리스트를 반으로 갈라서 연산 
        ListNode tmp = right.next;
        right.next = null;
        right = tmp; 

        // merge sort 
        left = sortList(left);
        right = sortList(right);
            
        return merge(left, right);
    }

    public ListNode getMid(ListNode ptr) {
        // prev를 저장하면서 할 수는 없으니, 한턴 전에 middle 을 찾을 수 있도록 
        // 하기 위해서 fast = ptr.next;
        ListNode slow = ptr;
        ListNode fast = ptr.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode ptr = new ListNode();
        ListNode dummy = ptr; 
        while(left != null && right != null) {
            if (left.val < right.val) {
                ptr.next = left;
                left = left.next; 
            } else {
                ptr.next = right;
                right = right.next;
            }
            ptr = ptr.next;
        }
        if (left != null) {
            ptr.next = left;
        }
        if (right != null) {
            ptr.next = right;
        }
        return dummy.next;
    }
}