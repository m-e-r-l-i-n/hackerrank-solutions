problem link-https://www.hackerrank.com/challenges/dynamic-array/problem

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]), q=Integer.parseInt(s[1]);
        List<List<Integer>> l=new ArrayList<>();
        /*do not use list instead of arraylist, because we need a dynamic array of integers, not an array of objects, which cant be instantiated
    error printed will be-List is abstract; cannot be instantiated
    */
        StringBuilder sb=new StringBuilder();
        int i,last=0;
        for(i=0;i<100000;i++)
        l.add(new ArrayList<>());

        for(i=0;i<q;i++)
        {
            s=bu.readLine().split(" ");
            int ch=Integer.parseInt(s[0]),x=Integer.parseInt(s[1]),y=Integer.parseInt(s[2]);
            x=(x^last)%n;
            if(ch==1)
            l.get(x).add(y);
            if(ch==2)
            {
            List<Integer> temp=l.get(x);
            last=temp.get(y%temp.size());
            sb.append(last+"\n");
            }
        }
        System.out.print(sb);
    }
} 
