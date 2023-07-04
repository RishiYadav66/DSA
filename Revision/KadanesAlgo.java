package Revision;

import java.io.*;

public class KadanesAlgo {

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

        int sum = 0;
        int start = 0;
        int ansBegin = -1;
        int ansEnd = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i;
            }
            sum = sum + arr[i];
            if (sum > max) {
                max = sum;
                ansBegin = start;
                ansEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("");
        for (int i = ansBegin; i <= ansEnd; i++) {
            System.out.print(arr[i] + "     ");
        }

        System.out.println("");
        System.out.println("Max Subarray sum : " + max);

    }
}