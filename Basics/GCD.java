import java.io.*;

public class GCD {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the First Number");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter the Second Number");
        int b = Integer.parseInt(br.readLine());
        int gcd = 1;
        for (int i = 1; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}