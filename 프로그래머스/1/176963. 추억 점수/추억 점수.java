import java.util.ArrayList;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        for(int i=0; i<photo.length; i++) {
        	int num = 0;
        	for(int j=0; j<photo[i].length; j++) {  		
        		for(int k=0; k<name.length; k++) {    			
        			if(photo[i][j].equals(name[k])) {
        				num += yearning[k];
        			}
        		}
        	}
        	list.add(num);
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}