problem link-https://www.hackerrank.com/challenges/manasa-and-stones/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the stones function below.
    static int[] stones(int n, int a, int b) {
        ArrayList<Integer> gap=new ArrayList<>();
        int i,j;
        if(n==1)
        {int x[]=new int[1];
        x[0]=a>b?a:b;
        return x;}

        n--;
        for(i=0;i<=n;i++)
        {int g=i*a+(n-i)*b;
        if(gap.contains(g)==false) gap.add(g);}
        Collections.sort(gap);
        int ans[]=new int[gap.size()];
        for(i=0;i<gap.size();i++)
        ans[i]=gap.get(i);
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int a = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int b = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = stones(n, a, b);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
