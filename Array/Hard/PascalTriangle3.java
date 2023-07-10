package Array.Hard;

import java.io.*;
import java.util.*;

public class PascalTriangle3 {

    // Print the Row of a pascal triangle
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the row : ");
        int row = Integer.parseInt(br.readLine());
        int col = row;
        int ans = 1;
        System.out.print(ans + " ");
        for (int i = 1; i < col; i++) {
            ans = ans * (col - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }

    }
}
