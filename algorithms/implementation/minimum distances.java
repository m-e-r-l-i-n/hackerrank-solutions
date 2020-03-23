problem link-https://www.hackerrank.com/challenges/minimum-distances/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
        int i,n=a.length,loc[][]=new int[n][2];
        for(i=0;i<n;i++)
        {loc[i][0]=a[i];
        loc[i][1]=i;}

        Arrays.sort(loc, new Comparator<int []>()
        {
            public int compare(final int c1[],final int c2[])
            {
                if(c1[0]>c2[0]) return 1;
                else if(c1[0]==c2[0] && c1[1]>c2[1]) return 1;
                else return -1;
            }
        });
        
        int min=100000;
        for(i=1;i<n;i++)
        if(loc[i][0]==loc[i-1][0])
        if((loc[i][1]-loc[i-1][1])<min) min=loc[i][1]-loc[i-1][1];
        if(min==100000) min=-1;
        return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
