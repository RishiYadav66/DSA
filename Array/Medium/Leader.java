package Array.Medium;

import java.io.*;
import java.util.*;

public class Leader {

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

        ArrayList<Integer> temp = new ArrayList<Integer>();
        int max = arr[n - 1];
        temp.add(max);
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                temp.add(arr[i]);
            }

        }

        System.out.println("Leaders : ");
        for (int i : temp) {
            System.out.println(i);
        }
    }
}