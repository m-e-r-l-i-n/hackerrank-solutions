problem link-https://www.hackerrank.com/challenges/kaprekar-numbers/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
        long i,ch=0;
        StringBuilder sb=new StringBuilder();
        for(i=p;i<=q;i++)
        {
            int l=Long.toString(i).length();
            String s=Long.toString(i*i);
            String s1="",s2="";
            if(s.length()==(2*l))
            {s1=s.substring(0,l);s2=s.substring(l);}
            else
            {
                if(l==1)
                {s1=s;
                s2="0";}
                else
                {s1=s.substring(0,l-1); 
                s2=s.substring(l-1);}
            }
            if((Integer.parseInt(s1)+Integer.parseInt(s2))==i)
            {sb.append(i+" ");ch=1;}
        }
        if(ch==1)
        System.out.print(sb);
        else System.out.print("INVALID RANGE");

    }

    
    public static void main(String[] args) throws Exception{
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int p=Integer.parseInt(bu.readLine()),q=Integer.parseInt(bu.readLine());
        kaprekarNumbers(p,q);
    }
}
