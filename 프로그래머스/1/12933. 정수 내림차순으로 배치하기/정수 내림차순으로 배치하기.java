class Solution {  
    public long solution(long n) {
        long answer = 0;
        StringBuffer str = new StringBuffer(n+"");
        n = str.length();
        String tmp = "";
        for (int j = 0; j < n; j++) {
            int maxNum = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(maxNum) <= str.charAt(i)) maxNum = i;
            }
            tmp = tmp + (str.charAt(maxNum)-'0');
            str.deleteCharAt(maxNum);
        }
        return Long.parseLong(tmp);
    }
}