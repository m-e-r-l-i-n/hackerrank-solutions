problem link-https://www.hackerrank.com/challenges/weighted-uniform-string/problem

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s=bu.readLine();
        int n=Integer.parseInt(bu.readLine());
        int i,w=0,c=1,last=0;	//c is count of characters, last is previous sum being stored
        HashSet<Integer> weight=new HashSet<>();	//boolean weight[]=new boolean[10000000];
        for(i=0;i<s.length();i++)
        {
            w=s.charAt(i)-96;
            if(w==last)
            {c++;w=w*c;}
            else
            {c=1;last=w;}
            weight.add(w);		//weight[w]=true
        }
        
        while(n-->0)
        {
            int v=Integer.parseInt(bu.readLine());
            if(weight.contains(v))		//if(weight[v])
            System.out.println("Yes");
            else 
            System.out.println("No");
        }
    }
}
