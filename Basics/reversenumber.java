import java.io.*;

public class reversenumber {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the Number");
        int num = Integer.parseInt(br.readLine());
        int reversenumber = 0;
        int rem = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            reversenumber = reversenumber * 10 + rem;
        }

        System.out.println("Your Reversed Number is " + reversenumber);

    }
}