package BasicRecursion;

import java.io.*;

public class PalindromeString {

    static boolean palindrome(int x, int y, String str) {
        if (x == str.length() / 2) {
            return true;
        }

        else if (str.charAt(x) != str.charAt(y)) {
            return false;
        }

        return palindrome(x + 1, y - 1, str);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter String");

        String str = br.readLine();

        System.out.println(palindrome(0, str.length() - 1, str));

    }
}