package BasicRecursion;

import java.io.*;

public class ReverseArray {

    static void reverse(int start, int end, int arr[]) {

        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            reverse(start + 1, end - 1, arr);
        }

    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the size of the array");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter your input");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        reverse(0, arr.length - 1, arr);
        System.out.println("Reversed Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}