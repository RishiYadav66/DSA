package Array.Easy;

import java.io.*;
import java.util.*;

public class UnionByArrayList {

    static ArrayList<Integer> findUnion(int a[], int b[], int n1, int n2) {
        ArrayList<Integer> union = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            }
        }
        while (i < n1) {
            if (union.get(union.size() - 1) != a[i]) {
                union.add(a[i]);
            }
            i++;
        }
        while (j < n2) {
            if (union.get(union.size() - 1) != b[j]) {
                union.add(b[j]);
            }
            j++;
        }
        return union;
    }

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

        System.out.println("Union of two arrays : ");
        ArrayList<Integer> union = findUnion(arr1, arr2, n1, n2);

        for (int i : union) {
            System.out.println(i);
        }
    }
}
