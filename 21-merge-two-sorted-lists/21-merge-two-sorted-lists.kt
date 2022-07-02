/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        // change both lists to var variable
        var l1 = list1
        var l2 = list2
        var head: ListNode = ListNode(0)
        var curr = head
        // stop condition: when it reaches the end of the listnode (either one is fine)
        while (l1 != null && l2 != null) {
            if (l1.`val` <= l2.`val`) {
                curr.next = l1
                l1 = l1.next
            } else {
                curr.next = l2
                l2 = l2.next
            }
            curr = curr.next!!
        }

        // 둘중에 하나가 먼저 끝난 경우
        if (l1 != null) {
            curr.next = l1
        } else if (l2 != null) {
            curr.next = l2
        }
        return head.next
    }
}