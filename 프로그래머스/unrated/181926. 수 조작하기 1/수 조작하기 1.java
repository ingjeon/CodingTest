class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for(char c : control.toCharArray()) {
            if(c == 'w') answer = answer + 1;
            else if(c == 's') answer = answer - 1;
            else if(c == 'd') answer = answer + 10;
            else if(c == 'a') answer = answer - 10;
        }  
        return answer;
    }
}