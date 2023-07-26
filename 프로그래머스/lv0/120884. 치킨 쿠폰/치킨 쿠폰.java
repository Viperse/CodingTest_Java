class Solution {
    public int solution(int chicken) {
        int coupon = chicken / 10;
        coupon += chicken % 10;
        int answer = chicken / 10;  
        
        for(int i=0; ;i++) {        	
        	if(coupon >= 10) {
            	answer += coupon / 10;           	
            	coupon = ((coupon / 10) + (coupon % 10));            	          	
            }           
            if(coupon < 10) {
        		break;
        	}       	
        }
        
        return answer;
    }
}
    