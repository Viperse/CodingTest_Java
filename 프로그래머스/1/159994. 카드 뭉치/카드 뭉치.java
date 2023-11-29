import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        List<String> c1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> c2 = new ArrayList<>(Arrays.asList(cards2));
        
        for(int i=0; i<goal.length; i++) {
        	if(!c1.isEmpty() && goal[i].equals(c1.get(0))) {
        		c1.remove(0);
        	} else if(!c2.isEmpty() && goal[i].equals(c2.get(0))) {
        		c2.remove(0);
        	} else {
        		answer = "No"; 
        		break;
        	}
        }
        return answer;
    }
}