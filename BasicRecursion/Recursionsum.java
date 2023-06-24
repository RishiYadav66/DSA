package BasicRecursion;

import java.io.*;

public class Recursionsum {

    static int sum(int n) {
        if (n == 0)
            return 0;

        return n + sum(n - 1);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number ");
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i <= num; i++) {

            System.out.println(sum(i));
        }

    }
}