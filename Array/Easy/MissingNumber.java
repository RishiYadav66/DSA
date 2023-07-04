package Array.Easy;

import java.io.*;
import java.util.*;

public class MissingNumber {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int n = 5;
        int arr[] = { 1, 2, 3, 5 };

        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }

        System.out.println("Missing number is : " + sum);

    }
}