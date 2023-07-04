package Revision;

import java.io.*;

public class QuickSort {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int pivotpoint(int arr[], int start, int end) {
        int i = start - 1;
        int pivot = arr[end];
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    static void qs(int arr[], int start, int end) {
        if (start >= end)
            return;
        int pivot = pivotpoint(arr, start, end);
        qs(arr, start, pivot - 1);
        qs(arr, pivot + 1, end);
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
        System.out.println("Quick Sort");
        qs(arr, 0, arr.length - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}