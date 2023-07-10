package Array.Medium;

import java.io.*;
import java.util.*;

//Better Approach
//TC : o(n^2)
//SC : O(n)+O(m)
public class Matrix2 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the size of the matrix");
        System.out.println("Enter the number of rows");
        int rows = Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns");
        int cols = Integer.parseInt(br.readLine());

        int arr[][] = new int[rows][cols];
        System.out.println("Enter thr elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Your Matrix is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        int r[] = new int[rows];
        int c[] = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (r[i] == 1 || c[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println("Your New Matrix is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
