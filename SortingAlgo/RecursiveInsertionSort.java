package SortingAlgo;

import java.io.*;

public class RecursiveInsertionSort {

    static void ris(int arr[], int n) {
        if (n >= arr.length - 1) {
            return;
        }
        for (int j = n + 1; j > 0; j--) {
            if (arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }

        ris(arr, n + 1);

    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        ris(arr, 0);

        System.out.println("Your elements");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
