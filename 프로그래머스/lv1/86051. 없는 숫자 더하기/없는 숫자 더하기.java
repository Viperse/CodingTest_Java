class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] n = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int i=0; i<numbers.length; i++) {
        	for(int j=0; j<n.length; j++) {
        		if(numbers[i]==n[j]) {
        			n[j] = 0;
        		}
        	}
        }
        
        for(int i=0; i<n.length; i++) {
        	answer += n[i];
        }
        
        return answer;
    }    
}