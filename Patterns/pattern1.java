import java.io.*;
import java.util.*;

public class pattern1 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int arr[] = new int[100];
        System.out.println("Enter the size : ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("---------------------------");
        System.out.println("Pattern 1");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print(" * ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 2");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" * ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 3");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {

                System.out.print(" * ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 4");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" " + j + " ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 5");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {

                System.out.print(" " + j + " ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 6");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" " + j + " ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 7");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {

                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" " + k);
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 8");
        System.out.println("---------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {

                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print(" " + k);
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 9");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("  ");
            }

            for (int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print(" " + k);
            }

            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 10");
        System.out.println("---------------------------");

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" " + k);
            }
            for (int l = n; l >= i; l--) {
                System.out.print("  ");
            }

            System.out.println("");
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print(" " + k);
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("  ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 11");
        System.out.println("---------------------------");

        for (int i = 1; i <= 2 * n - 1; i++) {

            if (i <= n) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(" " + k);
                }
            }
            if (i > n) {
                for (int k = i; k <= 2 * n - 1; k++) {
                    System.out.print(" " + k);
                }
            }

            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 12");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {
            int start = 1;
            if (i % 2 == 1) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 13");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("   ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }

            System.out.println("  ");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 14");
        System.out.println("---------------------------");
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 15");
        System.out.println("---------------------------");
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 16");
        System.out.println("---------------------------");
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 17");
        System.out.println("---------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i) + " ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 18");
        System.out.println("---------------------------");
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print("  ");
            }
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            for (char ch = 'A'; ch <= 'A' + i - 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 19");
        System.out.println("---------------------------");
        for (int i = 0; i < n; i++) {
            for (char ch = (char) (int) ('A' + n - i - 1); ch <= (char) (int) ('A' + n - 1); ch++) {
                System.out.print(ch + "  ");
            }

            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 20");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + "  ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print(j + "  ");
            }

            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 21");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("   ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }

            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 22");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + "  ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print(j + "  ");
            }

            System.out.println("");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("   ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }

            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 23");
        System.out.println("---------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("   ");
            }
            for (int j = n - 1; j >= i; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }

            System.out.println("");
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + "  ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + "  ");
            }

            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 24");
        System.out.println("---------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*" + "  ");

                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
        System.out.println("Pattern 25");
        System.out.println("---------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print(n - 1 + "  ");

                } else {
                    System.out.print(n - j~ + "   ");
                }
            }
            System.out.println("");
        }
    }

}