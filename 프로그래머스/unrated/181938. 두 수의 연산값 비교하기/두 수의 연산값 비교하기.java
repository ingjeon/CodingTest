class Solution {
    public int solution(int a, int b) {
        int answer = 2*a*b;
        int ab = Integer.parseInt(a+""+b);
        if(ab >= 2*a*b) {
            answer = ab;
        }
        return answer;
    }
}