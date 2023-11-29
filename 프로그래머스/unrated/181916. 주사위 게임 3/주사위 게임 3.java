class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if (a == b && a == c && a == d) answer = 1111 * a;
        
        else if (a == b && a == c) answer = (int)Math.pow((10 * a + d), 2);
        else if (a == b && a == d) answer = (int)Math.pow((10 * b + c), 2);
        else if (a == c && a == d) answer = (int)Math.pow((10 * c + b), 2);
        else if (b == c && b == d) answer = (int)Math.pow((10 * d + a), 2);

        else if (a == b && c == d) answer = (a + c) * Math.abs(a - c);
        else if (a == c && b == d) answer = (a + b) * Math.abs(a - b);
        else if (a == d && b == c) answer = (a + b) * Math.abs(a - b);

        else if (a == b) answer = (c * d);
        else if (a == c) answer = (b * d);
        else if (a == d) answer = (b * c);
        else if (b == c) answer = (a * d);
        else if (b == d) answer = (a * c);
        else if (c == d) answer = (a * b);

        else {
            int min = 7;
            if(a < min) min = a;
            if(b < min) min = b;
            if(c < min) min = c;
            if(d < min) min = d;
            answer = min;
        }
        return answer;
    }
}