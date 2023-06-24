package BasicRecursion;

import java.io.*;

public class Febonacii {

    static int febo(int x) {
        if (x <= 1)
            return x;

        return febo(x - 1) + febo(x - 2);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the range of Febonacii");
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <= n; i++) {
            System.out.println(febo(i));
        }

    }
}