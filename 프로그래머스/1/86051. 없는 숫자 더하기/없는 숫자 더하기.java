class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int i = 0; i < numbers.length; i++){
            if (1 <= numbers[i] && numbers[i] <=9) answer = answer - numbers[i];}
        return answer;
    }
}