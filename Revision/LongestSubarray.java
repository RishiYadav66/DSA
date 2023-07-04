package Revision;

import java.io.*;
import java.util.*;

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
        System.out.println("Your target");
        int target = Integer.parseInt(br.readLine());

        // best case scenario when only positive numbers in array
        // Time Complexity : O(n)
        // Space Complexity : O(1)
        // int i = 0;
        // int j = 0;
        // int length = 0;
        // int sum = 0;
        // while (i < n) {
        // sum = sum + arr[i];
        // if (sum < target) {
        // i++;
        // } else {
        // while (sum > target) {
        // sum = sum - arr[j];
        // j++;
        // }
        // if (sum == target) {
        // length = Math.max(length, i - j + 1);
        // }
        // i++;
        // }

        // best case scenario when both positive and negative numbers in array
        // Time Complexity : O(n)
        // Space Complexity : O(n)

        int sum = 0;
        int length = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (map.containsKey(sum - target)) {
                length = Math.max(length, i - map.get(sum - target));
            }
            map.put(sum, i);
        }

        System.out.println("length: " + length);
    }
}