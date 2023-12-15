class Solution {
    // 약수 가 홀수 ? 제곱수
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            answer = answer + i;
            if(Math.sqrt(i)%1==0) answer=answer-2*i;
        }
        return answer;
    }
}