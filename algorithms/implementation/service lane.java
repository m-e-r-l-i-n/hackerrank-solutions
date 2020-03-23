problem link-https://www.hackerrank.com/challenges/service-lane/problem

import java.io.*;
class Solution
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]), t=Integer.parseInt(s[1]);
        int i,a[]=new int[n];
        s=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            s=bu.readLine().split(" ");
            int l=Integer.parseInt(s[0]), r=Integer.parseInt(s[1]),min=1000000001;
            for(i=l;i<=r;i++)
            if(a[i]<min) min=a[i];
            sb.append(min+"\n");
        }
        System.out.print(sb);

    }
}
