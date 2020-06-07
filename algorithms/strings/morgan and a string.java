problem link-https://www.hackerrank.com/challenges/morgan-and-a-string/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(bu.readLine());
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            char a[]=bu.readLine().toCharArray(),b[]=bu.readLine().toCharArray();   //vive la github
            int i=0,j=0,n=a.length,m=b.length;
            for(i=0,j=0;i<n || j<m;)
            {
                int k=i,l=j;
                while(k<n && l<m && a[k]==b[l]) {k++; l++;}
                if(k==n)
                for(l=j;j<m && b[j]==b[l];j++) sb.append(b[j]);

                else if(l==m)
                for(k=i;i<n && a[i]==a[k];i++) sb.append(a[i]);

                else if(a[k]<b[l])
                for(k=i;i<n && a[i]==a[k];i++) sb.append(a[i]);

                else
                for(l=j;j<m && b[j]==b[l];j++) sb.append(b[j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
