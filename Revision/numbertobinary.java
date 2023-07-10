package Revision;

import java.io.*;

public class numbertobinary {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Number");
        int n = Integer.parseInt(br.readLine());
        String ans = "";
        while (n != 0) {
            int rem = n % 2;
            ans = rem + ans;
            n = n / 2;
        }

        System.out.println("Binary Number : " + ans);

    }
}
