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

### Fast & Slow pointers
- 두개의 포인터: Fast, Slow를 생성해서 LinkedList를 interate 한다
    - Fast는 2번 앞으로, Slow는 한 iteration에서 한번 앞으로
    - loop end condition은 Fast가 LinkedList의 마지막을 가리킬때 종료된다
    - 이때 Slow는 LinkedList의 중간을 가리키게 된다
- Slow가 가리키는 부분을 지점으로 LinkedList를 댕강! 잘라서 reverse 시킨다 (LinkedList reversal algorithm 참고)
    - 이때 prev라는 포인터가 slow를 따라서 가게 되는데, 이때 slow가 마지막에 다달았을때 (Fast 와 같은 부분을 가리킬때) 가 reversed LinkedList의 시작점이다
- left, right라는 포인터를 새로 생성, 각각 head (원래 input으로 주어졌던 LinkedList의 head), prev (slow로 reversed LinkedList를 만들게 된 head)로 지정 
    - while loop을 돌면서 각각의 value를 비교하고, 다를경우 false 를 리턴, loop 끝까지 false에 걸리지 않았다면 palindrome!
    - loop end condition: right이 null이 되는 경우  
- 관련자료: https://www.youtube.com/watch?v=yOzXms1J6Nk
