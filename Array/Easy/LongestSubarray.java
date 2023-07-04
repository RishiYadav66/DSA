package Array.Easy;

import java.io.*;

public class LongestSubarray {

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
        System.out.println("Enter target");
        int target = Integer.parseInt(br.readLine());

        // Brute force approach
        // int length = 0;
        // for (int i = 0; i < n; i++) {
        // int sum = 0;

        // for (int j = i; j < n; j++) {
        // sum = sum + arr[j];
        // if (sum == target) {
        // length = Math.max(length, j - i + 1);
        // }
        // }
        // }

        // System.out.println("max subarray: " + length);

        // Optimal Approach
        int sum = 0;
        int length = 0;
        int i = 0;
        int j = 0;

        while (j < n) {
            sum = sum + arr[j];
            if (sum < target) {
                j++;
            } else {
                while (sum > target) {
                    i++;
                }
                if (sum == target) {
                    length = Math.max(length, j - i + 1);
                }
                j++;
            }
        }
        System.out.println("Length: " + length);

    }
}
