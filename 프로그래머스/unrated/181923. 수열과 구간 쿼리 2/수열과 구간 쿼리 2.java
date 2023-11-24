class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];        
        for(int i = 0; i < queries.length; i = i + 1) {
            answer[i] = 1111111;
            for(int j = queries[i][0]; j <= queries[i][1]; j = j + 1) {
                if(arr[j] > queries[i][2]) {
                    if(arr[j] < answer[i]) {
                        answer[i] = arr[j];
                    }
                }
            }
            if(answer[i] == 1111111) answer[i] = -1;
        }
        return answer;
    }
}