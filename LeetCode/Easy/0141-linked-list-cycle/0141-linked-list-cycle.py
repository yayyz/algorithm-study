# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        # hashamp solution / time: O(N), space: O(N)
        # visited = set()
        # current = head

        # while current:
        #     if current in visited:
        #         return True 
        #     visited.add(current)
        #     current = current.next
        # return False

        # two pointers (floy'd cycle detection algorithm )
        if not head or not head.next: 
            return False

        slow, fast = head, head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                return True 
        return False
