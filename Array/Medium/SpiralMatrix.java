package Array.Medium;

import java.io.*;
import java.util.*;

public class SpiralMatrix {

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

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while (top <= bottom && left <= right) {
            for (int i = top; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;
        }
    }
}
