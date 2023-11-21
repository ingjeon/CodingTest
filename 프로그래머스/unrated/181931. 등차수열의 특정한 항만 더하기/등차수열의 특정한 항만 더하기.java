class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0; i < included.length; i = i + 1) {
            if(included[i] == true) {
                answer = answer + (a+d*(i));
            }
        }
        return answer;
    }
}