package Revision;

import java.io.*;
import java.util.*;

public class NextPermutation {

    static void reverse(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }

    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
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

        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            reverse(arr, 0, n - 1);
        }

        for (int i = n - 1; i > ind; i--) {
            if (arr[i] > arr[ind]) {
                swap(arr, ind, i);
                break;
            }
        }

        reverse(arr, ind + 1, n - 1);

        System.out.println("Your next lexicographical array is : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
