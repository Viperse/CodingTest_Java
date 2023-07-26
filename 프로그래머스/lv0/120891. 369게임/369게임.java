class Solution {
    public int solution(int order) {
    	String str = Integer.toString(order);
    	char[] ch = str.toCharArray();
    	int count = 0;
    	for(int i=0; i<ch.length; i++) {
    		if(ch[i] == '3' || ch[i] == '6' || ch[i] == '9') {
    			++count;
    		}
    	}
    	return count;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(3));
        System.out.println(s.solution(29423));
	}
}