problem link-https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] c) {
        int n=c.length,a[]=new int[n],b[]=new int[n],i,j;
        for(i=0;i<n;i++)
        for(j=0;j<n;j++)
        {a[j]+=c[i][j]; //a stores count of each type
        b[i]+=c[i][j];} //b stores size of each container

        int flag=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)    //here we are assigning each type to ball to each container
            if(a[i]==b[j]) 
            {b[j]=-1; flag++;break;}
        }
        if(flag==n) return "Possible";  //if all balls can be mapped
        else return "Impossible";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
