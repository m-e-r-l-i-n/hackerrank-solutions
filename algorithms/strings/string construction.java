problem link-https://www.hackerrank.com/challenges/string-construction/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the stringConstruction function below.
    static int stringConstruction(String s) {
        int i,a[]=new int[26],c=0;
        for(i=0;i<s.length();i++)
        a[s.charAt(i)-97]++;
        for(i=0;i<26;i++)
        if(a[i]>0) c++;     //basically all we need to do is find the number of unique characters
        return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = stringConstruction(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
