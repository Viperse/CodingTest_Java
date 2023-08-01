class Solution {
    public int solution(String s) {
        int answer = 0; 
        String[] sArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i=0; i<sArr.length; i++) {
        	
        	if(s.contains(sArr[i])) {
        		s = s.replace(sArr[i], numArr[i]);
        	} 
        }

        answer = Integer.parseInt(s);
        
        return answer;
    }
}