problem link-https://www.hackerrank.com/challenges/funny-string/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        char c[]=s.toCharArray();
        boolean f=true; int i=0,n=c.length;
        for(i=0;i<n-1;i++)
        if(Math.abs(c[i]-c[i+1])!=Math.abs(c[n-1-i]-c[n-1-(i+1)])) {f=false; break;}
        if(f) return "Funny";
        else return "Not Funny";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
