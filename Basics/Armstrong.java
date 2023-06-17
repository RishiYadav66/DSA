import java.io.*;

public class Armstrong {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter your Number");
        int num = Integer.parseInt(br.readLine());
        int rem = 0;
        int ans = 0;
        int count = 0;
        int temp = num;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = num;
        while (temp > 0) {
            rem = temp % 10;
            ans += Math.pow(rem, count);
            temp = temp / 10;

        }
        if (num == ans) {
            System.out.println("This number is Armstrong number");
        } else {
            System.out.println("This number is not Armstrong Number");
        }
    }
}