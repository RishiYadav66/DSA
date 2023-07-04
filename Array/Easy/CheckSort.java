package Array.Easy;

import java.io.*;
import java.util.*;

public class CheckSort {

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
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                continue;
            } else {
                sorted = false;
                break;
            }
        }
        if (sorted == true) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not sorted");
        }

    }
}
