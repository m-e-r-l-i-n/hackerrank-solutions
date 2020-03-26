problem link-https://www.hackerrank.com/challenges/acm-icpc-team/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int i,j,v=0,n=topic.length,max=0,c[]=new int[n*(n+1)/2];
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                for(int k=0;k<topic[i].length();k++)
                if(topic[i].charAt(k)=='1' || topic[j].charAt(k)=='1') c[v]++;
                if(c[v]>max) max=c[v];
                v++;
            }
        }
        int cnt=0;
        for(i=0;i<v;i++)
        if(c[i]==max) cnt++;
        int x[]={max,cnt};
        return x;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
