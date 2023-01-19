import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        List<Integer> done = new ArrayList<>();
        LinkedList<Integer> trucks = new LinkedList<Integer>();
        Queue<Integer> bridge = new LinkedList<Integer>();
        for (int truck : truck_weights) {
            trucks.add(truck);
        }

        // initialize queue (adding dummy data)
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        int answer = 0;
        int sum = 0;
        while (done.size() < truck_weights.length) {
            // 조건 만족
            if (trucks.peek() != null) {
                if (sum + trucks.peek() <= weight) {
                    int curr = trucks.poll();
                    bridge.add(curr);
                    sum += curr;
                }
            }
            if (bridge.size() < bridge_length) {
                bridge.add(0);
            }
            // iteration이 끝나면 빼주기
            int truck = bridge.poll();
            sum -= truck;
            if (truck != 0) {
                done.add(truck);
            }
            ++answer;
        }
        return answer;
    }
}