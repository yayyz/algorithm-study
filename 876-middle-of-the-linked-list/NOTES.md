```java
public ListNode detectCycle(ListNode head) {
	ListNode slow = head, fast = head;
	while(fast != null && fast.next != null) {
		fast = fast.next.next;
		slow = slow.next;
		if (slow == fast) {
			while (head != slow) {
				head = head.next;
				slow = slow.next;
			}
			return slow;				
		}
	}			
	return null;
}

```

문제풀이 2개 포인터를 나눠서 풀이
ListNode 구조상 어디가 tail 인지 알 수 없음 
