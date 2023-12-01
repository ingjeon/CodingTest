 

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while(true) {
            answer = answer + n % 10; 
            n = n / 10;
            if (n == 0) break;
        }
        return answer;
    }
}