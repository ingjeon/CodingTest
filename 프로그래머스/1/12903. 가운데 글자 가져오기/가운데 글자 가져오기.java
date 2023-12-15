class Solution {
    public String solution(String s) {
        String answer = "";
        int mid = s.length() / 2;
        if( s.length() % 2 == 0) 
            answer = answer + s.substring(mid-1,mid);
        answer = answer + s.substring(mid,mid+1);
        return answer;
    }
}