package Array.Medium;

import java.io.*;
import java.util.*;

public class RotateMatrix {

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
        System.out.println("After rotate : ");
        for (int j = 0; j < cols; j++) {
            for (int i = rows - 1; i >= 0; i--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
