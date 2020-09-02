problem link-https://www.hackerrank.com/challenges/sherlock-and-permutations/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static long M=1000000007;
    static long fact(int n)
    {
        long res=1;
        for(int i=2;i<=n;i++)
        res=res*i%M;
        return res;
    }

    static long power(long a,long b)
    {
        long res=1;
        while(b!=0)
        {
            if(b%2==1) res=res*a%M;
            b>>=1;
            a=a*a%M;
        }
        return res;
    }

    static int solve(int n, int m) 
    {
        m--;
        int s=(n+m);
        long num=fact(s),den=fact(n)*fact(m)%M;
        num*=power(den,M-2);
        num%=M;
        return (int)num;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int result = solve(n, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
