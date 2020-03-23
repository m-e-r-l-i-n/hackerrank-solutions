problem link-https://www.hackerrank.com/challenges/closest-numbers/problem

import java.io.*;
import java.util.*;
public class Solution
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine());
        int a[]=new int[n],i;
        String s[]=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(s[i]);
        Arrays.sort(a);
        ArrayList<Integer> r=new ArrayList<>();
        int diff=1000000000;
        for(i=0;i<n-1;i++)
        {
            int d=a[i+1]-a[i];
            if(d<diff)
            {
                r.clear();
                diff=d;
                r.add(a[i]);
                r.add(a[i+1]);
            }
            else if(d==diff)
            {
                r.add(a[i]);
                r.add(a[i+1]);
            }
        }
        String st="";
        for(i=0;i<r.size();i++)
        st+=r.get(i)+" ";
        System.out.print(st);
    }
}
