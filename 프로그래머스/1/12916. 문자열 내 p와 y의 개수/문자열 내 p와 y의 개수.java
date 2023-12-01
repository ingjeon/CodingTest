class Solution {
    boolean solution(String s) { 
        int countYy = 0;
        int countPp = 0;
        for(char c : s.toCharArray()) {
            if(c == 'y' || c == 'Y') countYy = countYy + 1;
            if(c == 'p' || c == 'P') countPp = countPp + 1;
        }
        return countPp == countYy ? true : false;
    }
}