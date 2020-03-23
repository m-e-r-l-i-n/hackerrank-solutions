problem link-https://www.hackerrank.com/challenges/strange-code/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the strangeCounter function below.
    static long strangeCounter(long t) 
    {
        long c=3;
        while(t>c)
        {   
            t=t-c;
            c=c*2;            
        }
        return (c-t+1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}






        long i,c=4,m=6;
        for(i=1;i<=t;i++)
        {
            --c;
            if(c==0)
            {
              c=m;
              m=2*m;
            }
        }
        return c;        
 
