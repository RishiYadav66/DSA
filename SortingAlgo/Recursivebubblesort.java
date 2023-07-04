package SortingAlgo;

import java.io.*;
import java.util.*;

public class Recursivebubblesort {

    static void rbs(int arr[], int n) {
        if (n == 1) {
            return;
        }

        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        rbs(arr, n - 1);
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

        rbs(arr, n);
        System.out.println("After Recursive Bubble Sort");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}