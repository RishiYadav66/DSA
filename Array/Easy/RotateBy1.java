package Array.Easy;

import java.io.*;
import java.util.*;

public class RotateBy1 {

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

        // Brute force approach
        // Time Complexity (O(n))
        // space complexity (O(n))
        int temp1[] = new int[n];

        temp1[n - 1] = arr[0];
        for (int i = 0; i < n - 1; i++) {
            temp1[i] = arr[i + 1];
        }
        System.out.println("Your elements ");
        for (int i = 0; i < n; i++) {
            System.out.println(temp1[i]);
        }

        // optimal approach
        // Time Complexity (O(n))
        // space complexity (O(1))
        int j = n - 1;
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[j] = temp;
        System.out.println("Your elements");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
