class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char[] arr1 = my_string.toCharArray();
        char[] arr2 = alp.toCharArray();
        
        for(int i=0; i<arr1.length; i++) {
        	for(int j=0; j<arr2.length; j++) {
        		if(arr1[i]==arr2[j]) arr1[i] = (char)((char)arr1[i] - 32);
        	}
        }
        answer = new String(arr1);
        return answer;
    }
}