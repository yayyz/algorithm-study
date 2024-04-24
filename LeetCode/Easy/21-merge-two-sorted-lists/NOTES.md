## 문제풀이
두가지 방법으로 풀이 할수 있음 
- iterative 
- recursion 

## iterative 
- list1, list2 중에 하나를 선택해서 head list로 선정하는게 더 효율적 (memory-wise?) 일 듯 하지만, 좀 더 명확하게 head를 지정하기 위해 새로운 listNode 리스트를 만들어서 풀이함 

## recursion
- 이렇게 풀이하지는 않았지만, 다른 사람의 풀이를 참고 했을때 recursive 하게 풀이 할 수도 있음
- 하지만, real-life 에 대입해봤을때, 데이터 셋이 커지는 경우 비효율 적일 수 있으니 iterative 한 풀이를 더 선호한다고 해당 문제 풀이한 사람이 적어놓음 

```java
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode handler;
        if(l1.val < l2.val) {
            handler = l1;
            handler.next = mergeTwoLists(l1.next, l2);
        } else {
            handler = l2;
            handler.next = mergeTwoLists(l1, l2.next);
        }
        
        return handler;
    }
}
```
