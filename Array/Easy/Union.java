package Array.Easy;

import java.io.*;
import java.util.*;

public class Union {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the size of array1");
        int n1 = Integer.parseInt(br.readLine());
        int arr1[] = new int[n1];
        System.out.println("Enter the elements");
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the size of array2");
        int n2 = Integer.parseInt(br.readLine());
        int arr2[] = new int[n2];
        System.out.println("Enter the elements");
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }
        // Time Complexity : (O(n1 + n2)log(n1+n2))
        // Space Complexity : (O(n1 + n2))
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n1; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < n2; i++) {
            set.add(arr2[i]);
        }
        System.out.println("Your Unique Element are : ");
        for (Integer x : set) {
            System.out.println(x);
        }

        // Time Complexity : (O(n1 + n2)log(n1+n2))
        // Space Complexity : (O(n1 + n2))
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < n2; i++) {
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }

        System.out.println("Your Unique Element are : ");
        for (Integer x : map.keySet()) {
            System.out.println(x);
        }

    }
}
