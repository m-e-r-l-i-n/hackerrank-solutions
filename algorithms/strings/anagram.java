problem link-https://www.hackerrank.com/challenges/anagram/problem?h_r=profile

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the anagram function below.
    static int anagram(String s) 
    {
        if(s.length()%2!=0) return -1;
        int n=s.length(),c1[]=new int[26],c2[]=new int[26],i,d=0;
        for(i=0;i<n;i++)
        if(i<n/2) c1[s.charAt(i)-'a']++;
        else c2[s.charAt(i)-'a']++;
        for(i=0;i<26;i++)
        d+=Math.abs(c1[i]-c2[i]);
        return d/2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
