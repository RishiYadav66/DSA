package Revision;

import java.io.*;

public class PrimeNumber {

    static boolean prime(int n) {
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number until which you want to print the prime numbers ");
        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i < n; i++) {
            if (prime(i)) {
                System.out.println(i);
            }
        }

    }
}
