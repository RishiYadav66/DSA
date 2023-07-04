package Array.Easy;

import java.io.*;
import java.util.*;

public class Intersection {

    static ArrayList<Integer> findIntersection(int a[], int b[], int n1, int n2) {
        ArrayList<Integer> intersect = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (a[i] == b[j]) {
                if (intersect.get(intersect.size() - 1) == b[i])
                    intersect.add(a[i]);
                i++;
                j++;
            } else {

                i++;
            }
        }

        return intersect;
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

        System.out.println("Intersection of two arrays : ");
        ArrayList<Integer> Intersection = findIntersection(arr1, arr2, n1, n2);

        for (int i : Intersection) {
            System.out.println(i);
        }

    }
}
