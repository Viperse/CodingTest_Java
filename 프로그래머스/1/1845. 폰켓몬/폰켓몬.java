import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int result = nums.length / 2;
        nums = Arrays.stream(nums).distinct().toArray();
        if(nums.length >= result) {
        	answer = result;
        } else answer = nums.length;
        return answer;
    }
}