problem link-https://www.hackerrank.com/challenges/separate-the-numbers/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
        int i;long firstx=0;
        boolean valid = false;

        for(i=0;i<s.length()/2;i++)
        {
            long x=Long.parseLong(s.substring(0,i+1));
            firstx=x; // Build up sequence starting with this number
            String test=Long.toString(x);
            while (test.length()<s.length())
                test+=Long.toString(++x);
            if (test.equals(s)) //compare to original string
            {valid = true;break;}

        }
        if(valid)
        System.out.println("YES "+ firstx);
        else
        System.out.println("NO");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}


//this soln is one of the simplest ones with least time complexity
