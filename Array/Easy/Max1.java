package Array.Easy;

import java.io.*;
import java.util.*;

public class Max1 {

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
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                if (max < count)
                    max = count;

            } else {
                count = 0;
            }

        }

        System.out.println("MAX 1 : " + max);

    }
}
