package Array.Hard;

import java.io.*;

public class PascalTriangle2 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Row number of Pascal triangle is : ");
        int r = Integer.parseInt(br.readLine());

        System.out.println("Coloumn number of Pascal triangle is : ");
        int c = Integer.parseInt(br.readLine());
        int ans = 1;
        for (int i = 1; i < c; i++) {
            ans = ans * (r - i);
            ans = ans / i;
        }

        System.out.println("Ans : " + ans);
    }
}