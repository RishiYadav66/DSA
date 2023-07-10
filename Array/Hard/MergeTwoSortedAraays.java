package Array.Hard;

import java.io.*;
import java.util.*;

public class MergeTwoSortedAraays {
    static void swap(int arr1[], int arr2[], int x, int y) {
        int temp = arr1[x];
        arr1[x] = arr2[y];
        arr2[y] = temp;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the size of array 1");
        int n1 = Integer.parseInt(br.readLine());
        int arr1[] = new int[n1];
        System.out.println("Enter the elements");
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the size of array 2");
        int n2 = Integer.parseInt(br.readLine());
        int arr2[] = new int[n2];
        System.out.println("Enter the elements");
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }

        // List<Integer> ans = new ArrayList<Integer>();
        // int left = 0;
        // int right = 0;
        // while (left < n1 && right < n2) {
        // if (arr1[left] <= arr2[right]) {
        // ans.add(arr1[left]);
        // left++;
        // } else {
        // ans.add(arr2[right]);
        // right++;
        // }
        // }

        // while (left < n1) {
        // ans.add(arr1[left]);
        // left++;
        // }
        // while (right < n2) {
        // ans.add(arr2[right]);
        // right++;
        // }
        for (int i = 0; i < n2; i++) {
            if (arr1[n1 - i - 1] > arr2[i]) {
                swap(arr1, arr2, n1 - i - 1, i);

            }

        }

        // System.out.println("After Merger");
        // for (int i : ans) {
        // System.out.println(i);
        // }

    }
}
