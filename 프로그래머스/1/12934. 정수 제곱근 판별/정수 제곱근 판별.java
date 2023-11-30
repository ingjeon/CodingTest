class Solution {
    public long solution(long n) {
        long answer = 0;
        for(long i = 1; i < 7200000; i++) {
            if(n/i == i && n%i == 0) {
                answer = i + 1;
                break;
            }
        }
        return (answer==0) ? -1 : answer * answer;
    }
}