package Array.Medium;

import java.io.*;
import java.util.*;

public class LongestConsecutive {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());
        // int arr[] = new int[n];
        // System.out.println("Enter the elements");
        // for (int i = 0; i < n; i++) {
        // arr[i] = Integer.parseInt(br.readLine());
        // }
        // Arrays.sort(arr);
        // int count = 1;
        // int max = 1;
        // for (int i = 1; i < n; i++) {
        // if (arr[i - 1] == arr[i]) {
        // continue;
        // } else if (arr[i - 1] + 1 == arr[i]) {
        // count++;
        // } else {
        // count = 1;
        // }
        // if (count > max) {
        // max = count;
        // }
        // }
        // System.out.println("Max consecutive : " + max);

        // optimal approach
        // TC = O(n);
        // SC = O(n);
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(br.readLine()));
        }

        int count = 1;
        int cur = 0;
        int max = 0;
        System.out.println(set);
        for (int x : set) {
            if (!set.contains(x - 1)) {
                cur = x;
                count = 1;
            }
            while (set.contains(cur + 1)) {
                cur = cur + 1;
                count = count + 1;
            }
            max = Math.max(max, count);
        }

        System.out.println(max);

    }
}
