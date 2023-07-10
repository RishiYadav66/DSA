package Array.Hard;

import java.io.*;

public class PascalTriangle1 {
    static void printrow(int r) {
        int ans = 1;
        System.out.print(ans + " ");
        for (int i = 1; i < r; i++) {
            ans = ans * (r - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number of rows of Pascal Triangle :");
        int rows = Integer.parseInt(br.readLine());

        for (int i = 1; i <= rows; i++) {
            printrow(i);
            System.out.println();
        }
    }
}
