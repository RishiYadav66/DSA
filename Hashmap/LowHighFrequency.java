package Hashmap;

import java.io.*;
import java.util.*;

public class LowHighFrequency {

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

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxCount = 0;
        int minCount = n;
        int maxElement = 0;
        int minElement = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxCount) {
                maxCount = count;
                maxElement = element;
            }
            if (count < minCount) {
                minCount = count;
                minElement = element;
            }

        }

        System.out.println("Max element " + maxElement + " : " + maxCount);
        System.out.println("Min element " + minElement + " : " + minCount);

    }
}
