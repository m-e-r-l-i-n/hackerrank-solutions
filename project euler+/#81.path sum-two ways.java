import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws Exception
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine()),i,j;
        long a[][]=new long[n][n];

        for(i=0;i<n;i++)
        {
            String s[]=bu.readLine().split(" ");
            for(j=0;j<n;j++)
            a[i][j]=Integer.parseInt(s[j]);
        }

        for(i=1;i<n;i++)
        {
            a[0][i]+=a[0][i-1];
            a[i][0]+=a[i-1][0];
        }

        for(i=1;i<n;i++)
        for(j=1;j<n;j++)
        a[i][j]+=Math.min(a[i-1][j],a[i][j-1]);

        System.out.print(a[n-1][n-1]);
    }
}
