import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(answer).boxed().collect(Collectors.toList());
        for(int i=start; i>=end_num; i--) {
        	list.add(i);
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
