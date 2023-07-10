package Array.Hard;

import java.io.*;
import java.util.*;

public class MoreThanOneThird {

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
        // int count = 0;
        // HashSet<Integer> set = new HashSet<Integer>();
        // for (int i = 0; i < n; i++) {
        // count = 1;
        // for (int j = i + 1; j < n; j++) {
        // if (arr[i] == arr[j]) {
        // count++;
        // if (count > n / 3) {
        // set.add(arr[i]);
        // }
        // }
        // }
        // }
        // if (set.isEmpty()) {
        // System.out.println("No elements occuring more than 1/3 times");
        // } else {
        // for (int i : set) {
        // System.out.println("Elements occuring more than 1/3 times");
        // System.out.println(i);
        // }
        // }

        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for (int i = 0; i < n; i++) {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }

        // System.out.println("More than n/3");
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // if (entry.getValue() > n / 3) {
        // System.out.println(entry.getKey());
        // }
        // }

        int count1 = 0;
        int ele1 = Integer.MIN_VALUE;
        int count2 = 0;
        int ele2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (count1 == 0 && arr[i] != ele2) {
                count1++;
                ele1 = arr[i];
            } else if (count2 == 0 && arr[i] != ele1) {
                count2++;
                ele2 = arr[i];
            } else {
                if (ele1 == arr[i]) {
                    count1++;
                } else if (ele2 == arr[i]) {
                    count2++;
                } else {
                    count1--;
                    count2--;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (ele1 == arr[i]) {
                count1++;
            }
            if (ele2 == arr[i]) {
                count2++;
            }
        }

        System.out.println("More than N/3 times :");
        if (count1 > n / 3) {
            System.out.println(ele1);
        }
        if (count2 > n / 3) {
            System.out.println(ele2);
        }
    }
}
