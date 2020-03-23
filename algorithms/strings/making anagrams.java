problem link-https://www.hackerrank.com/challenges/making-anagrams/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {
        int a[]=new int[26],b[]=new int[26],i;
        for(i=0;i<s1.length();i++)
        a[s1.charAt(i)-97]++;
        for(i=0;i<s2.length();i++)
        b[s2.charAt(i)-97]++;

        int diff=0;
        for(i=0;i<26;i++)
        diff+=(int)Math.abs(a[i]-b[i]);
        return diff;      
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
