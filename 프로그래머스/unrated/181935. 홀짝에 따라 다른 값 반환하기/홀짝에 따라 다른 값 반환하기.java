class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 1) {
            for(n = n; n > 0; n = n - 2) {
                answer = answer + n;
            }
        } else {
            for(n = n; n > 0; n = n - 2) {
                answer = answer + n*n;
            }
        }
        return answer;
    }
}