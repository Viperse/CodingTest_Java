import java.util.ArrayList;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++) {
        	for(int j=i; j>=0; j--) {
        		if(ch[i]==ch[j] && i != j) {
        			answer[i] = i - j;
        			break;
        		} else {
        			answer[i] = -1;
        		}
        	}
        }
        return answer;
    }
}