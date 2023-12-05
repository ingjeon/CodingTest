class Solution {
    public String solution(String phone_number) {
        String answer = "";
        if (phone_number.length() == 4) answer = phone_number;
        else {
            for(int i =4; i < phone_number.length(); i++) {
                answer = answer + "*";
            }
            answer = answer + phone_number.substring(phone_number.length()-4);                  
        }
        return answer;
    }
}