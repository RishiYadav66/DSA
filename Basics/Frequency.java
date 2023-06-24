import java.io.*;
import java.util.*;

public class Frequency {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the size of an array");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Distinct elements");
        Arrays.sort(arr);
        boolean visited[] = new boolean[n];
        for (int i = 0; i < arr.length; i++) {

            int count = 1;
            if (visited[i] == true) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " " + count);
        }
    }

}