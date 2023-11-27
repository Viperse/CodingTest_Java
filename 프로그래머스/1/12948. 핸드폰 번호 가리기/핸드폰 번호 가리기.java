class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arr = phone_number.toCharArray();
        for(int i=arr.length-5; i>=0; i--) {
        	arr[i] = '*';
        }
        answer = String.valueOf(arr);
        return answer;
    }
}