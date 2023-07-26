class Solution {
	
    public String solution(String my_string) {
    	String answer = "";
        char[] my = my_string.toCharArray();
        for(int i : my) {
        	if (i > 64 && i<91) {
        		answer += (char)(i + 32);
        	} else if (i > 96 && i < 123) {
        		answer += (char) (i - 32);
        	}
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	System.out.println(s.solution("cccCCC"));
    	System.out.println(s.solution("abCdEfghlj"));
    }
}