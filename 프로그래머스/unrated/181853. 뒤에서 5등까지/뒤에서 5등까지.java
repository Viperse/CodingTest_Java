import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        IntStream numList = Arrays.stream(num_list);
        answer = numList.sorted().limit(5).toArray();
        return answer;
    }
}