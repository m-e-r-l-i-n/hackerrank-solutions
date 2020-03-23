problem link-https://www.hackerrank.com/challenges/a-chocolate-fiesta/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int solve(int[] a) {
        int i,e=0,o=0,M=1000000007;
        for(i=0;i<a.length;i++)
        if(a[i]%2==0) e++;
        else o++;
        BigInteger a1=new BigInteger("0");
        a1=a1.valueOf(2).pow(e).subtract(a1.valueOf(1));
        BigInteger a2=new BigInteger("0");
        if(o>1)
        a2=a2.valueOf(2).pow(o-1).subtract(a2.valueOf(1));
        return a1.add(a2).add(a1.multiply(a2)).mod(a1.valueOf(M)).intValue();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[aCount];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int aItr = 0; aItr < aCount; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr]);
            a[aItr] = aItem;
        }

        int result = solve(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
