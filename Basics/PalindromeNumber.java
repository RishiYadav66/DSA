import java.io.*;

public class PalindromeNumber {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter your Number");
        int num = Integer.parseInt(br.readLine());
        int reversednumber = 0;
        int rem;
        int test = num;

        while (test > 0) {
            rem = test % 10;
            test = test / 10;
            reversednumber = reversednumber * 10 + rem;
        }

        if (reversednumber == num) {
            System.out.println("Yes,Its a palindrome Number");

        }

        else {

            System.out.println("No, It's not a palindrome Number");
        }

    }
}