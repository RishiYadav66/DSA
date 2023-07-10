package Revision;

import java.io.*;
import java.util.*;

public class BinarytoNumber {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Binary Number");
        long n = Integer.parseInt(br.readLine());
        long ans = 0;
        long i = 0;
        while (n != 0) {
            long rem = n % 10;
            ans += rem * Math.pow(2, i);
            n = n / 10;
            i++;
        }

        System.out.println(ans);
    }
}
