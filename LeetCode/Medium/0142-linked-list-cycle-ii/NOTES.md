## Solution
- hashtable(hashmap) 사용해서 풀이 (좀 더 intuitive approach) 
- pointer 풀이 
  - Floyd's Cycle Finding Algorithm / fast, slow pointer를 사용해서 cycle을 찾는 방법 
### hashtable 
- LinedList의 node를 하나씩 traverse 하면서 다음 node가 이미 방문한 적 있는 node인지 확인 
- 방문한 적 있는 node를 저장하기 위해서 hashtable (hashmap) 자료구조 사용
  - Map<ListNode, Integer> nodeMap = new HashMap<ListNode, Integer>(); Integer는 그저 placeholder 값, 아무거나 넣어도 상관없음. 
- node가 nodeMap에 없다면 추가, 그리고 pointer 를 다음 node로 
- node가 nodeMap에 있다면, 이미 방문한적 있는 node 이므로 cycle found! 
​
​
### fast, slow (Floyd’s Cycle Finding Algorithm) 
​