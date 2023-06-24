package BasicRecursion;

import java.io.*;

public class Name {

    static void print(String str, int n) {
        if (n == 0) {
            return;
        }
        print(str, n - 1);
        System.out.println(str);

    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the name: ");
        String str = br.readLine();
        System.out.println("Enter number of time you want to print");
        int n = Integer.parseInt(br.readLine());
        print(str, n);

    }
}
