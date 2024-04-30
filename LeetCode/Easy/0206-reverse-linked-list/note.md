### 풀이 
node의 포인터를 3가지 종류로 가져간다 
- next: 현재 node의 다음 node에 대한 주소를 저장하기 위해 사용 
- curr: linkedlist를 traverse 하기 위해 사용
- reversedList: 문제 풀이의 return 값으로 사용 

순방향으로 저장되어있는 linkedlist의 pointer들을 재정렬 하는 방법으로 reversed 된 리스트를 반환한다.
모든 linkedlist의 끝은 NULL값이므로 이를 이용해서 reversedList의 initial value는 null로 설정한다 
각 iteration 마다 수행:
- next 값을 저장 
- curr.next 포인터가 reversedList를 향하도록 변경 
- reversedList 를 curr 로 변경 (작업이 완료되었을때는 reversed list의 head를 포인팅 하고 있을 예정) 
- curr 값을 iteration 초반에 저장했던 next 값으로 변경 
