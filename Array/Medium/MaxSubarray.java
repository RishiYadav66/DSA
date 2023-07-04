package Array.Medium;

import java.io.*;
import java.util.*;

public class MaxSubarray {

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

        // Brute Force Approach
        // Time complexity : O(n^2)

        // int maxsum = Integer.MIN_VALUE;
        // for (int i = 0; i < n; i++) {
        // int sum = 0;
        // for (int j = i; j < n; j++) {
        // sum = sum + arr[j];
        // maxsum = Math.max(maxsum, sum);
        // }
        // }

        // System.out.println("Max sum: " + maxsum);

        // Optimal Approach - Kadanes Algo
        // Time complexity : O(n)
        int sum = 0;
        int start = 0;
        int begin = -1;
        int end = -1;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i;
            }
            sum = sum + arr[i];
            if (sum > maxsum) {
                maxsum = sum;
                begin = start;
                end = i;
            } else if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("");
        for (int i = begin; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Max sum: " + maxsum);

    }
}
