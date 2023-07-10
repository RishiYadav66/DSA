package Revision;

import java.io.*;
import java.util.*;

public class RemoveDuplicateWords {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();
        HashSet<String> set = new LinkedHashSet<>();
        String[] word = str.split(" ");
        for (int i = 0; i < word.length; i++) {
            set.add(word[i]);
        }
        for (String i : set) {
            System.out.println(i);
        }
    }
}
