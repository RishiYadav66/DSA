package Array.Hard;

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
        System.out.println("Target :");
        int target = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        int max = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum == target) {
                max = i + 1;
                start = 0;
                end = i;
            }
            if (map.containsKey(sum - target)) {
                start = map.get(sum - target) + 1;
                end = i;
                max = Math.max(max, end - start);
            } else if (!map.containsKey(sum - target)) {
                map.put(arr[i], 1);
            }

        }
        System.out.println("Longest Subarray ");
        System.out.println(max);

        System.out.println("From " + start + " to " + end);
        for (int i = start; i <= end; i++) {
            System.out.println(arr[i]);
        }

    }
}