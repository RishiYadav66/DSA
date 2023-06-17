import java.io.*;

public class countdigits {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter your Number");
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Your number contains " + count + " digits");

    }
}