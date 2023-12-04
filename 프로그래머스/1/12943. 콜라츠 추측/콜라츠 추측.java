class Solution {
    public int solution(int num) {
        int answer = -1;
        long tmp = num;
        if (tmp == 1) return 0;
        for (int i = 0; i < 500; i++) {
            if (tmp % 2 == 0) tmp = tmp / 2;
            else tmp = tmp * 3 + 1;
            if (tmp == 1) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}