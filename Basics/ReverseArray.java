import java.io.*;

public class ReverseArray {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the length of array");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        System.out.println("Enter the objects of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Your Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("Your Reversed Array");
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}