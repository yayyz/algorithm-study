import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * 프로그래머스:heap:더 맵게
 * https://programmers.co.kr/learn/courses/30/lessons/42626
 */
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int food : scoville) {
            minHeap.add(food);
        }

        int answer = 0;
        while (!rootMoreThanK(minHeap, K)) {
            if (minHeap.size() == 1) {
                answer = -1;
                break;
            } else {
                int root = minHeap.poll();
                int second = minHeap.poll();
                int calculated = root + (second * 2);
                minHeap.offer(calculated);
                ++answer;
            }
        }
        return answer;
    }

    public boolean rootMoreThanK(PriorityQueue<Integer> heap, int K) {
        int root = heap.peek();
        return root >= K;
    }
}
