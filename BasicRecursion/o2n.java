package BasicRecursion;

import java.io.*;

public class o2n {

    static void print(int i, int n) {
        if (i > n) {
            return;
        }

        System.out.println(i);
        print(i + 1, n);

    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number");
        int n = Integer.parseInt(br.readLine());

        print(1, n);

    }
}