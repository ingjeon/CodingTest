class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for(int i = 0; i < num_list.length; i = i + 1) {
            if(num_list[i] % 2 == 1) {
                odd = odd + num_list[i];
            } else {
                even = even + num_list[i];
            }
        }
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
}