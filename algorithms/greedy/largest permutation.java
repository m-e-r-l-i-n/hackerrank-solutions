problem link-https://www.hackerrank.com/challenges/largest-permutation/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the largestPermutation function below.
    static int[] largestPermutation(int k, int[] a) 
    {
        int i,j,n=0,m,t=0;
        int b[]=new int[a.length];
        for(i=0;i<a.length;i++)
        b[i]=a[i];
        Arrays.sort(b);
        for(i=0;i<a.length && k>0;i++)
        {
            m=b[a.length-1-i];
            if(a[i]!=m)
                {
                    for(j=i+1;j<a.length;j++)
                        if(a[j]==m){n=j;break;}
                    t=a[i];a[i]=a[n];a[n]=t;
                    --k;
                }                
        }
        return a;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = largestPermutation(k, arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
