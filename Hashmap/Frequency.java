package Hashmap;

import java.io.*;
import java.util.*;

public class Frequency {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the size of array : ");
        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Frequency Count :");
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
