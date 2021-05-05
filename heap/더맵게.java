import java.util.Iterator;
import java.util.PriorityQueue;

/**
* 통과하지느 못함 (아직!) 
*/
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int food : scoville) {
            minHeap.add(food);
        }

        // 제일 처음 노드, 그 다음 노드의 합이 k 보다 클 경우?
        boolean flag = false;
        int answer = 0;
        while (!flag) {
            if (minHeap.size() == 1) {
                answer = -1;
                flag = true;
            } else {
                Iterator<Integer> itr = minHeap.iterator();
                int root = itr.next();
                int nextNode = itr.next();
                int calculated = root + (nextNode * 2);
                if (calculated < K) {
                    // 첫번째, 두번째 노드 삭제
                    minHeap.poll();
                    minHeap.poll();
                    minHeap.offer(calculated);
                } else {
                    flag = true;
                }
                ++answer;
            }
        }
        return answer;
    }
}
