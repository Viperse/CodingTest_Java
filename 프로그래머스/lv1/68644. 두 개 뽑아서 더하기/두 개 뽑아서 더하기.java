import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(answer).boxed().collect(Collectors.toList());
        for(int i=0; i<numbers.length; i++) {
        	for(int j=0; j<numbers.length; j++) {
        		if(i!=j) list.add(numbers[i]+numbers[j]);
        	}
        }
        answer = list.stream().distinct().sorted().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}