package Revision;

import java.io.*;
import java.util.*;

public class NumberOfSubarray {

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
        System.out.println("Target : ");
        int k = Integer.parseInt(br.readLine());
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                count++;
                System.out.println("Subarray found from index 0 to " + i);
                for (int j = 0; j <= i; j++) {
                    System.out.println(arr[j]);
                }
            }
            if (map.containsKey(sum - k)) {
                count++;
                int startIndex = map.get(sum - k) + 1;
                System.out.println("Subarray found from index " + startIndex + " to " + i);
                for (int j = startIndex; j <= i; j++) {
                    System.out.println(arr[j]);
                }
            }
            map.put(sum, i);
        }
        System.out.println("Count : " + count);
    }

}
