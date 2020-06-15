problem link-https://www.hackerrank.com/challenges/sherlock-and-the-beast/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the decentNumber function below.
    static void decentNumber(int n) {
        int i,th=0,fi=0;
        for(i=0;i<=n;i++)
        if(i%3==0 && (n-i)%5==0) {fi=i; th=n-i;}
        StringBuilder sb=new StringBuilder();
        if(th==0 && fi==0) sb.append("-1\n");
        else
        {
            for(i=0;i<fi;i++)
            sb.append(5);
            for(i=0;i<th;i++)
            sb.append(3);
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                decentNumber(n);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
