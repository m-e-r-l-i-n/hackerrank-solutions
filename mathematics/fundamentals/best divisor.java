problem link-https://www.hackerrank.com/challenges/best-divisor/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine());
        int i,no=n,d=0,sumd=0,max=0,maxi=0;
        while(no>0)
        {
            sumd+=no%10;
            no/=10;
        }
        for(i=1;i<=n/2;i++)
            if(n%i==0)
            {
                int temp=i,sumt=0;
                while(temp>0)
                {
                    sumt+=temp%10;
                    temp/=10;
                }
                if(sumt>max) {max=sumt; maxi=i;}
            }
        if(max>=sumd) d=maxi;
        else d=n;
        System.out.print(d);
    }
}
