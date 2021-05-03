import java.util.ArrayList;
import java.util.List;

/**
 * 프로그래머스:완전탐색:모의고사
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */
class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3]; // 카운팅을 할 배열

        for (int i = 0; i < answers.length; i++) {
            if (a[i % a.length] == answers[i]) {
                count[0] = count[0] + 1;
            }
            if (b[i % b.length] == answers[i]) {
                count[1] = count[1] + 1;
            }
            if (c[i % c.length] == answers[i]) {
                count[2] = count[2] + 1;
            }
        }

        int max = 0;
        List<Integer> answerList = new ArrayList<>();
        // i+1 하는 이유는 학생의 넘버링이 zero-based 가 아니기 때문!
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                answerList.clear();
                answerList.add(i + 1);
                max = count[i];
            } else if (max == count[i]) {
                answerList.add(i + 1);
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
