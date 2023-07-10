package Array.Medium;

import java.io.*;

//Bruteforce Approach 
//TC: O(n^3)
public class Matrix1 {

    static void markrow(int[][] arr, int rows, int cols, int k) {
        for (int i = 0; i < cols; i++) {
            if (arr[k][i] == 1) {
                arr[k][i] = -1;
            }
        }
    }

    static void markcol(int[][] arr, int rows, int cols, int l) {
        for (int i = 0; i < cols; i++) {
            if (arr[i][l] == 1) {
                arr[i][l] = -1;
            }
        }
    }

    static void ans(int[][] arr, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }

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

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    markrow(arr, rows, cols, i);
                    markcol(arr, rows, cols, j);
                }
            }
        }
        ans(arr, rows, cols);
        System.out.println("Your New Matrix is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
