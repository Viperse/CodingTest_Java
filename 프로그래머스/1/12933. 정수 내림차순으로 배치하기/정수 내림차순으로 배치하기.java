import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] ch = String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder(new String(ch)).reverse();
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}