import java.util.*; 
// x 짝수 => /2  홀수 => *3 +1 
// x 가 1 되면 콜라츠 문제
// 1 ~ 1000 까지 무조건 됨
class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        while(true) {
            if(n == 1){
                answer.add(n);
                break;
            } else if(n % 2 == 0){
                answer.add(n);
                n = n / 2;                
            } else if(n % 2 == 1){
                answer.add(n);
                n = 3 * n + 1;
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}