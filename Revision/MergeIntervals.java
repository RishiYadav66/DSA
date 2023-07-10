package Revision;

import java.io.*;
import java.util.*;

public class MergeIntervals {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number of Intervals : ");
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the start of the interval " + (i + 1) + " : ");
            arr[i][0] = Integer.parseInt(br.readLine());
            System.out.print("Enter the end of the interval " + (i + 1) + " : ");
            arr[i][1] = Integer.parseInt(br.readLine());
        }
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < arr.length; i++) {
            if (list.isEmpty() || arr[i][0] > list.get(list.size() - 1).get(1)) {
                list.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            else{
               list.get(list.size()-1).set(1, Math.max(list.get(list.size()-1).get(1),arr[i][1]))  
            }
        }
        for (List<Integer> i : list) {
            System.out.println(i);
        }

    }
}
