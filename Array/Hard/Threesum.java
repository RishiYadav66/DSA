package Array.Hard;

import java.io.*;
import java.util.*;

public class Threesum {

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

        // for (int i = 0; i < n - 2; i++) {
        // for (int j = i + 1; j < n - 1; j++) {
        // for (int k = j + 1; k < n; k++) {

        // if (arr[i] + arr[j] + arr[k] == 0) {
        // System.out.println("[ " + arr[i] + ", " + arr[j] + ", " + arr[k] + " ]");
        // }

        // }
        // }
        // }

        // optimal approach - TC : O(n^2) and no better approach than this
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            map.clear();
            for (int j = i + 1; j < arr.length; j++) {
                int ans = -(arr[j] + arr[i]);
                if (map.containsKey(ans)) {
                    System.out.println("[ " + arr[i] + ", " + ans + ", " + arr[j] + " ]");
                } else {
                    map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
                }
            }
        }

    }
}
