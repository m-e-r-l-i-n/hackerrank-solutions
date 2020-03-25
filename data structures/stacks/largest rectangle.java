problem link-https://www.hackerrank.com/challenges/largest-rectangle/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the largestRectangle function below.
    static long largestRectangle(int[] h) { //largest area of histogram(stack implementation)
        int i=0,n=h.length,t;
        long max=0,m=0;
        Stack<Integer> s=new Stack<>();
        while(i<n)
        {
            if(s.isEmpty() ||h[s.peek()]<=h[i]) //push larger bars
            s.push(i++);

            else
            {
                t=s.peek();     //pop smaller bars
                s.pop();
                m=1l*h[t]*(s.isEmpty()?i:i-s.peek()-1); //calculate areas considering t as smallest bar
                max=max>m?max:m;
            }
        }

        while(s.isEmpty()==false)   //pop all elements and calculate area considering them as smallest
        {
            t=s.peek();     //pop smaller bars
            s.pop();
            m=1l*h[t]*(s.isEmpty()?i:i-s.peek()-1);
            max=max>m?max:m; 
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        long result = largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
