class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        } else {
            int[] answer = new int[arr.length - 1];
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (min > arr[i]) min = arr[i];
            }
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (min != arr[i]) {
                    answer[j] = arr[i];
                    j++;
                }
            }
            return answer;
        }
    }
}