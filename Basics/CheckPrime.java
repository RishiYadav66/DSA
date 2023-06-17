import java.io.*;

public class CheckPrime {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number");
        int num = Integer.parseInt(br.readLine());

        if (num == 0 || num == 1) {
            System.out.println("It is not a prime number");
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    System.out.println("It is not a prime number");
                    return;
                }
            }
            System.out.println("Prime number");
        }
    }
}