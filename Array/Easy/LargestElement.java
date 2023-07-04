package Array.Easy;

import java.io.*;
import java.util.*;

public class LargestElement {

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
        // worst approach
        System.out.println("Largest element");
        System.out.println("Time Complexity : O(nlogn)");
        Arrays.sort(arr);

        System.out.println(arr[arr.length - 1]);

        // best approach
        System.out.println("Largest element");
        System.out.println("Time Complexity : O(n)");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
