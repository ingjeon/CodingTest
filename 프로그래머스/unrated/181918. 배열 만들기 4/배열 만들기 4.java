import java.util.*; 
// arr 정수배열, i = 0, i < arr.length 일때
// stk 빈 배열 : +arr[i] , i +1
// stk 원소O,stk[stk.length-1] < arr[i] : +arr[i] , i +1
// stk 원소O,stk[stk.length-1] >= arr[i] : remove stk[stk.length-1]

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(stk.isEmpty()){
                stk.add(arr[i]);
            } else if(stk.get(stk.size()-1) >= arr[i]) {
                stk.remove(stk.size()-1);
                i = i - 1;
            } else if(stk.get(stk.size()-1) < arr[i]) {
                stk.add(arr[i]);
            }
        }
        return stk.stream().mapToInt(i -> i).toArray();
    }
}