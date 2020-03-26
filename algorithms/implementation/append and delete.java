problem link-https://www.hackerrank.com/challenges/append-and-delete/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        int n=s.length(),m=t.length(),l=Math.min(m,n),i,c=0;
        for(i=0;i<l;i++)
        if(s.charAt(i)==t.charAt(i)) c++;
        else break;

        if((m+n)<k) return "Yes";
        else if(((m+n-2*c)<=k) && (m+n-2*c)%2==k%2) return "Yes";
        else return "No";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
