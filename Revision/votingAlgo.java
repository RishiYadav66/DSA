package Revision;

import java.io.*;
import java.util.*;

public class votingAlgo {

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

        int count = 0;
        int maxele = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                maxele = arr[i];
                count++;
            } else {
                if (arr[i - 1] == arr[i]) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        if (count > 0) {
            System.out.println("Majority element : " + maxele);
        } else {
            System.out.println("No majority element");
        }

    }
}
