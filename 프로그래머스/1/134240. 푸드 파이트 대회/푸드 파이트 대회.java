class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i<food.length; i++) {
        	int num = food[i] / 2;
        	for(int j=0; j<num; j++) {
        		answer += i;
        	}
        }
        StringBuilder sb = new StringBuilder(answer).reverse();
        answer = answer + "0" + sb;
        return answer;
    }
}