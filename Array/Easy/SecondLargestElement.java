package Array.Easy;

import java.io.*;
import java.util.*;

public class SecondLargestElement {

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

        // better approach
        System.out.println("Better approach : O(n + n)");
        System.out.println("Second Largest Element");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int sl = Integer.MIN_VALUE;
        int ss = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (ss > arr[i] && arr[i] != min) {
                ss = arr[i];
            }
            if (sl < arr[i] && arr[i] != max) {
                sl = arr[i];
            }
        }
        System.out.println(sl);
        System.out.println(ss);
        // best apprach
        System.out.println("Best approach : O(n)");
        System.out.println("Second Largest Element");
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondsmallest) {
                secondsmallest = arr[i];
            }
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }

        }

        System.out.println("smallest : " + smallest + "  second smallest : " + secondsmallest);

        System.out.println("largest : " + largest + "   second largest : " + secondlargest);
    }
}
