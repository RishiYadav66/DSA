package Array.Medium;

import java.io.*;
import java.util.*;

public class MajorityElement {

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
        // int majorityelement = 0;
        // int index = 0;
        // for (int i = 0; i < n; i++) {
        // int count = 0;
        // for (int j = 0; j < n; j++) {
        // if (arr[i] == arr[j]) {
        // count++;

        // }
        // }
        // if (count > majorityelement) {
        // majorityelement = count;
        // index = i;
        // }
        // }

        // if (majorityelement > n / 2) {
        // System.out.println("majority element : " + arr[index] + ", count : " +
        // majorityelement);
        // } else {
        // System.out.println("No majority element");
        // }

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        // if (map.containsKey(arr[i])) {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // } else {
        // map.put(arr[i], 1);
        // }
        // }

        // for (int i = 0; i < n; i++) {
        // if (map.get(arr[i]) > n / 2) {
        // System.out.println("Majority Element : " + arr[i]);
        // return;
        // }
        // }

        // System.out.println("No Majority Element");

        int maxele = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count++;
                maxele = arr[i];
            } else {
                if (arr[i] == arr[i - 1]) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        if (count > 0) {
            System.out.println("max element : " + maxele);
        } else {
            System.out.println("no major elements");
        }
    }

}
