package Array.Medium;

import java.io.*;

public class ZeroOneTwo {

    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
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

        // Brute force
        // TC : O(nlog(n))
        // SC : O(1)
        // Arrays.sort(arr);

        // Better approach
        // TC : O(n) + O(n)
        // SC : O(1)
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            System.out.println(0);
        }
        for (int i = 0; i < count1; i++) {
            System.out.println(1);
        }
        for (int i = 0; i < count2; i++) {
            System.out.println(2);
        }

        // best approach
        // TC : O(n)
        // SC : O(1)
        // int i = 0;
        // int j = 0;
        // int k = arr.length - 1;
        // while (j <= k) {
        // if (arr[j] == 0) {
        // swap(arr, i, j);
        // i++;
        // j++;
        // } else if (arr[j] == 2) {
        // swap(arr, j, k);
        // k--;

        // } else {
        // j++;
        // }
        // }

        System.out.println("After 3 pointer approach : ");

        for (int x : arr) {
            System.out.println(x);
        }
    }
}
