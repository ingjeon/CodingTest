class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for(int i = 0; i < queries.length; i++) {
            String tmp = "";
            if(queries[i][0] != 0) tmp = tmp + answer.substring(0,queries[i][0]);
            for(int j = queries[i][1]; j >= queries[i][0]; j--){
                tmp = tmp + answer.charAt(j);
            }
            if(queries[i][1] != my_string.length()) tmp = tmp + answer.substring(queries[i][1]+1);
        answer = tmp;
        }
        return answer;
    }
}