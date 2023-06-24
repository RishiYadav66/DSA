import java.io.*;

public class Fibonacii {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n = Integer.parseInt(br.readLine());
        int secondlast = 0;
        int last = 1;
        int cur;
        System.out.print(secondlast + " ");
        System.out.print(last + " ");

        for (int i = 2; i <= n; i++) {
            cur = last + secondlast;
            secondlast = last;
            last = cur;
            System.out.print(cur + " ");
        }
    }
}