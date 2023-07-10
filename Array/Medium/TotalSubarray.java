package Array.Medium;

import java.io.*;

public class TotalSubarray {

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
        System.out.println("Enter Target");
        int k = Integer.parseInt(br.readLine());
        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 0;
        while (j < n) {
            sum = sum + arr[j];
            if (sum < k) {
                j++;

            } else {
                while (sum > k) {
                    sum = sum - arr[i];
                    i++;

                }
                if (sum == k) {
                    count++;
                }
                j++;
            }
        }

        System.out.println("Total subarrays : " + count);

    }
}