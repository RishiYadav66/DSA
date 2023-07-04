package Array.Easy;

import java.io.*;
import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number of elements");
        int n = Integer.parseInt(br.readLine());
        // First approach : Time complexity (O(n)) space complexity (O(n))
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(br.readLine()));
        }

        System.out.println("Unique Elements");
        for (Integer i : set) {
            System.out.println(i);
        }

        // optimal case but works only for sorted elements
        // Time complexity if sorted (O(n)) and if unsorted (O(nlogn)+O(n))
        // space complexity (O(1))
        int arr[] = new int[n];
        System.out.println("This approach only works for sorted elements");
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("Unique Elements");
        for (int k = 0; k < i + 1; k++) {
            System.out.println(arr[k]);
        }

    }
}