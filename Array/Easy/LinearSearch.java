package Array.Easy;

import java.io.*;

public class LinearSearch {

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

        System.out.println("Enter the element you want to search");
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            if (num == arr[i]) {
                System.out.println("Your element is at index " + i);
            }

        }

    }
}