import java.util.HashMap;
import java.util.Map;

/**
 * 완주하지 못한 선수
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
class Solution1 {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        // convert array to hashmap for completion
        for (String person : participant) {
            if (map.containsKey(person)) {
                map.put(person, (int)map.get(person) + 1);
            } else {
                map.put(person, 1);
            }
        }

        // find participant who completed
        for(String person: completion) {
            map.put(person, map.get(person) - 1);
        }

        String answer = "";
        // search for participant who did not complete
        for (String person: participant) {
            if (map.get(person) != 0) {
                answer = person;
                break;
            }
        }
        return answer;
    }
}
