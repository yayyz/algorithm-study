import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * K번째수
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 */
public class Solution {

    public int[] solution(int[] array, int[][] commands) {
        List<int[]> list = new ArrayList<>();
        List<Integer> kth = new ArrayList<>();
        for (int[] command : commands) {
            list.add(Arrays.copyOfRange(array, command[0] -1 , command[1]));
            kth.add(command[2]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Arrays.sort(list.get(i));
            answer[i] = list.get(i)[kth.get(i) - 1];
        }
        return answer;
    }
}
