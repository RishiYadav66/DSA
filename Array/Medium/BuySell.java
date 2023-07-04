package Array.Medium;

import java.io.*;
import java.util.*;

public class BuySell {

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

        // int maxprofit = 0;
        // int buy = -1;
        // int sell = -1;
        // for (int i = 0; i < n; i++) {
        // int profit = 0;
        // for (int j = i + 1; j < n; j++) {
        // profit = arr[j] - arr[i];
        // if (profit > maxprofit) {
        // maxprofit = profit;
        // buy = i + 1;
        // sell = j + 1;
        // }
        // }
        // }

        // System.out.println("Max profit : " + maxprofit + " when buy on day " + buy +
        // " and sell on " + sell);

        int min = Integer.MAX_VALUE;
        int max = 0;
        int begin = -1;
        int end = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                begin = i + 1;
            }
            if (arr[i] - min > max) {
                max = arr[i] - min;
                end = i + 1;
            }
        }

        System.out.println("Max profit: " + max);
        System.out.println("when buy on day " + begin + " and sell on " + end);
    }
}