import java.io.*;

public class PalindromeString {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter String");
        String str = br.readLine();
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            char c1 = str.charAt(0);
            char c2 = str.charAt(str.length() - 1);
            if (c1 != c2) {
                isPalindrome = false;
            } else {
                c1++;
                c2--;
            }
        }

        if (isPalindrome == false) {
            System.out.println("Not palindrome");
        } else {
            System.out.println("Palindrome String");
        }

    }
}