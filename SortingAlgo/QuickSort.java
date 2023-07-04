package SortingAlgo;

import java.io.*;
import java.util.*;

public class QuickSort {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int pivotpoint(int arr[], int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, j, i);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    static void quicksort(int arr[], int left, int right) {
        if (left < right) {
            int pivot = pivotpoint(arr, left, right);
            quicksort(arr, left, pivot - 1);
            quicksort(arr, pivot + 1, right);
        }

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

        quicksort(arr, 0, arr.length - 1);

        System.out.println("After QuickSort");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}