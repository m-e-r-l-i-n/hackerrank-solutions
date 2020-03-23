problem link-https://www.hackerrank.com/challenges/kindergarten-adventures/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the solve function below.
     */
    static int solve(int[] t)
    {
        /*
         * Return the ID
         */
         int n=t.length;
        int a[]=new int[n],c=0,i;
        for(i=0; i<n; i++)
        { 
            if(i>=t[i]) c++;
            a[(i+1-t[i]+n)%n]--;
            a[(i+1)%n]++;
        }

    int result=0,bestval=c;

    for(i=1; i<n; i++)
        if((c+=a[i])>bestval)
        {bestval=c;
        result=i;}

    return result+1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tCount = Integer.parseInt(scanner.nextLine().trim());

        int[] t = new int[tCount];

        String[] tItems = scanner.nextLine().split(" ");

        for (int tItr = 0; tItr < tCount; tItr++) {
            int tItem = Integer.parseInt(tItems[tItr].trim());
            t[tItr] = tItem;
        }

        int id = solve(t);

        bufferedWriter.write(String.valueOf(id));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
