package Array.Easy;

import java.io.*;
import java.util.*;

public class RotateByN {

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
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

        System.out.println("Enter upto which element you want to rotate");
        int num = Integer.parseInt(br.readLine());

        // Brute force Approach
        // time complexity (O(n*n))
        // for (int k = 0; k < num; k++) {
        // int temp = arr[0];
        // for (int i = 0; i < n - 1; i++) {
        // arr[i] = arr[i + 1];
        // }
        // arr[n - 1] = temp;
        // }

        // System.out.println("Your elements after left rotate brute force operation");
        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i]);
        // }

        // optimal approach
        // time complexity (O(n))
        reverse(arr, 0, num - 1);
        reverse(arr, num, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        System.out.println("Your elements after left roatate optimal solution");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        reverse(arr, 0, num);
        reverse(arr, num + 1, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        System.out.println("Your elements after right roatate optimal solution");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
