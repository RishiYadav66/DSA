package Array.Easy;

import java.io.*;
import java.util.*;

public class AppearOnce {

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

        // second best approach
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }

        // System.out.println("Number which is appearing once : ");
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // if (entry.getValue() == 1) {
        // System.out.println(entry.getKey());
        // }
        // }

        // best approach
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }

        System.out.println("Single element in this array is : " + xor);

    }
}
