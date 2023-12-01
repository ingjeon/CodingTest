class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int tmp = x;
        while(true) {
            sum = sum + tmp % 10;
            tmp = tmp / 10;
            if (tmp == 0) break;
        }
        return (x % sum == 0) ? true : false;
    }
}