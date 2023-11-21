import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // String a = str;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>=65 && str.charAt(i)<=90) {
                System.out.print((char)(str.charAt(i)+32));
            }
            else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
                System.out.print((char)(str.charAt(i)-32));
            }
        }        
            
        // for (char c : a.toCharArray()) {
        //     if(c>=65 && c<=90) {
        //         System.out.print((char)(c + 32));
        //     }
        //     else if(c>=97 && c<=122) {
        //         System.out.print((char)(c - 32));
        //     }
        // }        
    }
}