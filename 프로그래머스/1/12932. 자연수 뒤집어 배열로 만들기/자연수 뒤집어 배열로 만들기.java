import java.util.*;
class Solution {
    public int[] solution(long n) {
        String[] list = String.valueOf(n).split("");
        int[] answer = new int[list.length];
        for (int j = list.length; j > 0; j--)
            answer[list.length-j] = Integer.parseInt(list[j - 1]);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}