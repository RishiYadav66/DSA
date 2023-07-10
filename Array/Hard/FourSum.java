package Array.Hard;

import java.io.*;
import java.util.*;

public class FourSum {

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
        System.out.println("Enter Target");
        int target = Integer.parseInt(br.readLine());

        // HashSet<List<Integer>> set = new HashSet<>();
        // for (int i = 0; i < n - 3; i++) {
        // for (int j = i + 1; j < n - 2; j++) {
        // for (int k = j + 1; k < n - 1; k++) {
        // for (int l = k + 1; l < n; l++) {
        // if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
        // List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
        // Collections.sort(temp);
        // set.add(temp);

        // }
        // }
        // }
        // }
        // }

        // System.out.println(set);

        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // HashSet<List<Integer>> set = new HashSet<List<Integer>>();

        // for (int i = 0; i < n - 3; i++) {
        // for (int j = i + 1; j < n - 2; j++) {
        // for (int k = j + 1; k < n; k++) {
        // int ans = target - (arr[i] + arr[j] + arr[k]);
        // if (map.containsKey(ans)) {
        // List<Integer> ansList = Arrays.asList(arr[i], arr[j], arr[k], ans);
        // Collections.sort(ansList);
        // set.add(ansList);
        // } else {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }

        // }
        // }
        // }

        // System.out.println(set);

        // optimal approach
        Arrays.sort(arr);
        List<List<Integer>> quadruplets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum == target) {
                        quadruplets.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        k++;
                        l--;
                        while (k > j + 1 && arr[k] == arr[k - 1]) {
                            k++;
                        }
                        while (k < l && arr[l] == arr[l + 1]) {
                            l--;
                        }
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        for (List<Integer> quad : quadruplets) {
            System.out.println(quad);
        }

    }
}
