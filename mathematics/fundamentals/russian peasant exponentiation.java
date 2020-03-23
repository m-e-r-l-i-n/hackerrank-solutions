problem link-https://www.hackerrank.com/challenges/russian-peasant-exponentiation/copy-from/147749403

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int mmod(long n,int mod)
    {
        n=(n-(n/mod)*mod);
        if(n<0) n=mod+n;    //the most vital step to prevent out of bounds
        return (int)n;
    }

    static int[] solve(int a, int b, long k, int m) {
        int v[]={a%m,b%m};
        if(k==1) return v;
        else
        {
            v[0]=mmod(1l*a*a-1l*b*b,m);
            v[1]=mmod(2l*a*b,m);
            int x[]=solve(v[0],v[1],k/2,m);
            if(k%2==1)
            {
                int y[]=new int[2];
                y[0]=mmod(1l*a%m*x[0]-1l*b%m*x[1],m);
                y[1]=mmod(1l*a*x[1]+1l*b*x[0],m);
                x=y;
            }
            return x;
        }   
    }

    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(bu.readLine());
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            String s[]=bu.readLine().split(" ");
            int a=Integer.parseInt(s[0]),b=Integer.parseInt(s[1]),m=Integer.parseInt(s[3]);
            long k=Long.parseLong(s[2]);
            int ar[]=solve(a,b,k,m);
            sb.append(ar[0]+" "+ar[1]+"\n");
        }
        System.out.print(sb);
    }
}
