problem link-https://www.hackerrank.com/challenges/bigger-is-greater/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
        char c[]=w.toCharArray();
        int i=c.length-1;
        while(i>0 && c[i-1]>=c[i]) i--; //largest index such that c[i-1]>=c[i]
        if(i<=0) return "no answer";
    
        int j=c.length-1;
        while(c[j]<=c[i-1]) j--;    //rightmost character which is bigger than c[i]
        char temp=c[i-1];   //swap
        c[i-1]=c[j];
        c[j]=temp;
    
        j=c.length-1;
        while(i<j)  //swap the remaining portion of the string so that it becomes smallest
        {
            temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        return new String(c);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
