class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int index0 = money / 5500;
        int index1 = money - (5500 * index0);
        answer[0] = index0;
        answer[1] = index1;
        return answer;
    }
}
