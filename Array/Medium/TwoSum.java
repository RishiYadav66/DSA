package Array.Medium;

import java.io.*;
import java.util.*;

public class TwoSum {

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
        int target = Integer.parseInt(br.readLine());

        // Brute force Approach
        // TC : O(n^2)
        // SC : O(1)
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] + arr[j] == target) {
        // list.add(i);
        // list.add(j);
        // }
        // }
        // }
        // System.out.println("Two sum :" + list.get(0) + " " + list.get(1));

        // Optimal Approach
        // TC : O(n)
        // SC : O(n)
        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        // if (map.containsKey(target - arr[i])) {
        // list.add(map.get(target - arr[i]));
        // list.add(i);
        // }
        // map.put(arr[i], i);
        // }

        // System.out.println("Two sum :" + list.get(0) + " " + list.get(1));

        // Best Approach
        // Time Complexity : O(n)+O(log(n))
        // space complexity : O(1)
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int j = arr.length - 1;
        int i = 0;
        while (i < n) {
            if (arr[i] + arr[j] < target) {
                i++;
            } else {
                while (arr[i] + arr[j] > target) {
                    j--;
                }
                if (arr[i] + arr[j] == target) {
                    list.add(i);
                    list.add(j);
                }
                i++;
            }
        }
        System.out.println("After Sort : ");
        for (int x : arr) {
            System.out.println(x);
        }
        System.out.println("Two sum :" + list.get(0) + " " + list.get(1));
    }
}