## approach 
### String manipulation 
- ListNode들의 value를 String에 저장하고, 각 value들을 저장하기 위해서 iterate 할때, reversed 된 값도 저장한다 
- iteration이 끝났을때 저장된 String 값과 reversed된 String값의 동일성을 비교 

```java
class Solution {
    public boolean isPalindrome(ListNode head) {
        // String manipulation
        String val = "";
        String reversedVal = "";
        while(head != null) {
            int num = head.val;
            val += num;
            reversedVal = num + reversedVal;
            head = head.next;
        }
        return val.equals(reversedVal);
    }
}
```
- 이렇게는 모든 test case를 통과하지만 time limit을 초과한다 
- String manipulation은 비싸다!!!!!!!!!!!!!

### Array with pointers
- ListNode의 값을 담을 수 있는 arrayList를 하나 생성 
- 이 arrayList의 시작점 (index =0)과 끝 (index = size -1)을 가리키는 두개의 포인터를 생성 
- 두개의 pointer가 겹치거나 크로스 되는 지점을 while loop end condition으로 지정한다
- 각각 start과 end가 가리키는 index의 value를 비교하고 틀린다면 false를 return, 아니라면 끝까지 탐색 후 true를 return 한다
