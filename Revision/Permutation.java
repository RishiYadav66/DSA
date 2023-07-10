package Revision;

import java.io.*;
import java.util.*;

public class Permutation {

    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void permutations(int arr[], int start) {
        if (start == arr.length) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = start; i < arr.length; i++) {
                swap(arr, start, i);
                permutations(arr, start + 1);
                swap(arr, start, i);
            }
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

        permutations(arr, 0);
    }
}
