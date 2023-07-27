class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sumPrice = 0;
        
        for(int i=0; i<=count; i++) {
        	sumPrice += price * i;
        }        
        
        if(money >= sumPrice) return answer = 0; 
        else return answer = sumPrice - money;
    }
}