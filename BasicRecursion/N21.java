package BasicRecursion;

import java.io.*;

public class N21 {

    static int print(int n) {
        if (n == 0) {
            return 1;
        }
        System.out.println(n);
        return print(n - 1);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number");
        int n = Integer.parseInt(br.readLine());

        print(n);

    }
}