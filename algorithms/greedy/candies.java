problem link-https://www.hackerrank.com/challenges/candies/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the candies function below.
    static long candies(int n, int[] a) {
        long c[]=new long[n];
        int i;
        c[0]=1;
        for(i=1;i<n;i++)
        {
            c[i]=1;
            if(a[i]>a[i-1]) c[i]=c[i-1]+1;
        }

        for(i=n-1;i>0;i--)
        if(a[i]<a[i-1] && c[i]>=c[i-1]) c[i-1]=c[i]+1;

        long ans=0;
        for(i=0;i<n;i++) 
        ans+=c[i];
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
