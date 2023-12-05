class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 0;
        for(int i=0; i<month.length; i++) {    	
        	if(i+1==a) {
        		day += b;
        		answer = week[day % 7];
        		break;
        	}
        	day += month[i];
        }
        return answer;
    }
}