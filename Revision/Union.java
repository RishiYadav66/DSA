package Revision;

import java.io.*;
import java.util.*;

public class Union {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the size of array");
        int n1 = Integer.parseInt(br.readLine());
        int arr1[] = new int[n1];
        System.out.println("Enter the elements");
        for (int i = 0; i < n1; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the size of array");
        int n2 = Integer.parseInt(br.readLine());
        int arr2[] = new int[n2];
        System.out.println("Enter the elements");
        for (int i = 0; i < n2; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                temp.add(arr1[i]);
                i++;
            } else {
                if (arr1[i] > arr2[j]) {
                    temp.add(arr2[j]);
                    j++;
                } else {
                    temp.add(arr1[i]);
                    i++;
                    j++;
                }
            }
        }

        System.out.println("Union of Two arrays : ");
        for (int x = 0; x < temp.size(); x++) {
            System.out.println(temp.get(x));
        }
    }
}
