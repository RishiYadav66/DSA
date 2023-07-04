package Revision;

import java.io.*;
import java.util.*;

public class MergeSort {

    static void merge(int arr[], int start, int mid, int end) {

        ArrayList<Integer> temp = new ArrayList<Integer>();

        int left = start;
        int right = mid + 1;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= end) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = start; i <= end; i++) {
            arr[i] = temp.get(i - start);
        }
    }

    static void ms(int arr[], int start, int end) {
        int mid = (start + end) / 2;
        if (start >= end) {
            return;
        }
        ms(arr, start, mid);
        ms(arr, mid + 1, end);
        merge(arr, start, mid, end);
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
        System.out.println("After Merge Sort");
        ms(arr, 0, arr.length - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
