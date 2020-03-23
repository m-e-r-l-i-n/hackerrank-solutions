problem link-https://www.hackerrank.com/challenges/palindrome-index/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static boolean palindrome(String s,int l, int r)
    {
        while(l<=r)
        {
        if(s.charAt(l)!=s.charAt(r)) return false;
        l++;r--;
        }
        return true;
    }
    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) 
    {
        int l=0,r=s.length()-1;
        while(l<r)
        {
            if(s.charAt(l)==s.charAt(r))
            {
                l++; r--;
            }
            else
            {
                if(palindrome(s,l+1,r)) return l;   //recursion to find if removing an index from left side will result in a palindrome
                if(palindrome(s,l,r-1)) return r;   //recursion to find if removing an index from right side will result in a palindrome
            }
        }
        return -1;  //when string is already a palindrome
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
