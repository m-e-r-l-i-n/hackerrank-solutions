problem link-https://www.hackerrank.com/challenges/summing-the-n-series/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the summingSeries function below.
     */
    static int summingSeries(long n) {
        /*
         * Write your code here.
         */
         BigInteger b=new BigInteger("0");
         return Integer.parseInt(b.valueOf(n).modPow(b.valueOf(2),b.valueOf(1000000007)).toString());
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            long n = Long.parseLong(scanner.nextLine().trim());

            int result = summingSeries(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
