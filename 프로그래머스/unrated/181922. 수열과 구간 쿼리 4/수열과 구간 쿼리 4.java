class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};        
        for(int i = 0; i < queries.length; i = i + 1) {
            for(int j = queries[i][0]; j <= queries[i][1]; j = j + 1) {
                if(j % queries[i][2] == 0) {
                    arr[j] = arr[j] + 1;
                }
            }
        }
        answer = arr;
        return answer;
    }
}