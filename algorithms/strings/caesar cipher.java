problem link-https://www.hackerrank.com/challenges/caesar-cipher-1/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k)
    {
        int i;char ch,c;String wd="";
        k=k%26;
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            c=ch;
            if(Character.isAlphabetic(ch)==true)
            {
                c=(char)(ch+k);
                if(Character.isUpperCase(ch) && c>'Z')
                c=(char)(64+(c-90));
                if(Character.isLowerCase(ch) && c>'z')
                c=(char)(96+(c-122));
            }
        wd=wd+c;        
        }

        return wd;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

