import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws Exception {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            String s[]=bu.readLine().split(" ");
            int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]),i,j;
            long max=0;
            char c[]=bu.readLine().toCharArray();
            int a[]=new int[n];
            for(i=0;i<n;i++)
            a[i]=c[i]-'0';
            for(i=0;i<n-k;i++)
            {
                long p=1;
                for(j=0;j<k;j++)
                {
                    p*=a[i+j];
                    if(p==0) break;
                }
                if(j==k && p>max) max=p;
            }
            sb.append(max+"\n");
        }
        System.out.print(sb);
    }
}
