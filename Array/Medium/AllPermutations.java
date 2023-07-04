package Array.Medium;

import java.io.*;
import java.util.*;

public class AllPermutations {
    static void swap(int arr[], int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void permutations(int[] arr, List<List<Integer>> temp, int start) {
        if (start == arr.length - 1) {
            ArrayList<Integer> permutation = new ArrayList<>();
            for (int num : arr) {
                permutation.add(num);
            }
            temp.add(permutation);
        } else {
            for (int i = start; i < arr.length; i++) {
                swap(arr, start, i);
                permutations(arr, temp, start + 1);
                swap(arr, start, i);
            }
        }
    }

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
        Arrays.sort(arr);
        ArrayList<List<Integer>> temp = new ArrayList<List<Integer>>();
        permutations(arr, temp, 0);
        for (List<Integer> permutation : temp) {
            System.out.println(permutation);
        }
        for (int i = 0; i < temp.size(); i++) {
            if (Arrays.toString(arr).equals(temp.get(i).toString())) {
                if (temp.get(i + 1).equals(null)) {
                    System.out.println(temp.get(0));
                } else {
                    System.out.println(
                            "Next lexiographical permutation after the given output is : "
                                    + temp.get(i + 1).toString());

                }
            }
        }
    }
}