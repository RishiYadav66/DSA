package Revision;

import java.io.*;
import java.util.*;

public class Gcd {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number 1");
        int n1 = Integer.parseInt(br.readLine());

        System.out.println("Enter the number 2");
        int n2 = Integer.parseInt(br.readLine());
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }

        }

        System.out.println("GCD of " + n1 + " & " + n2 + " is " + gcd);
    }
}
