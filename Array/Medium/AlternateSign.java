package Array.Medium;

import java.io.*;

public class AlternateSign {

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
        // ArrayList<Integer> temp1 = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        // if (arr[i] >= 0) {
        // temp1.add(arr[i]);
        // }
        // }
        // ArrayList<Integer> temp2 = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        // if (arr[i] < 0) {
        // temp2.add(arr[i]);
        // }
        // }

        // for (int i = 0; i < n / 2; i++) {
        // arr[2 * i] = temp1.get(i);
        // arr[2 * i + 1] = temp2.get(i);
        // }
        // System.out.println("After rearranging");
        // for (int x : arr) {
        // System.out.println(x);
        // }

        int i = 0;
        int j = 1;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] >= 0 && i < arr.length) {
                swap(arr, k, i);
                i = i + 2;
            } else if (arr[k] < 0 && j < arr.length) {
                swap(arr, k, j);
                j = j + 2;
            }
        }

        System.out.println("After rearranging");
        for (int x : arr) {
            System.out.println(x);
        }

    }
}
