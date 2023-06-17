import java.io.*;

public class Primenumbers {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the number until which you want to print Prime Numbers");
        int num = Integer.parseInt(br.readLine());
        if (num == 1) {
            System.out.println("1 is not a prime number");
        } else {
            System.out.println("Prime Numbers");
            for (int i = 2; i <= num; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }

    }

    static boolean isPrime(int num) {

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}