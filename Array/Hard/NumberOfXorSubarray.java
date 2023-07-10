package Array.Hard;

import java.io.*;
import java.util.*;

public class NumberOfXorSubarray {

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
        System.out.println("Enter target : ");
        int k = Integer.parseInt(br.readLine());

        // Brute Force Approach
        // for (int i = 0; i < n; i++) {
        // int xor = 0;
        // for (int j = i; j < n; j++) {
        // xor = xor ^ arr[j];
        // if (xor == k) {
        // System.out.println("Array");
        // for (int l = i; l <= j; l++) {
        // System.out.println(arr[l]);
        // }
        // }
        // }
        // }

        // optimal Approach
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1);
        int count = 0;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
            if (map.containsKey(xor ^ k)) {
                count += map.get(xor ^ k);
            } else {
                map.put(xor, map.getOrDefault(xor, 0) + 1);
            }
        }

        System.out.println("There are " + count + " Xor subarrays ");

    }
}
