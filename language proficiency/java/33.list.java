problem link-https://www.hackerrank.com/challenges/java-list/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> l=new ArrayList<>();
        int n,q,i=0;
        n=Integer.parseInt(bu.readLine());
        String s[]=bu.readLine().split(" ");
        while(n-->0)
        l.add(Integer.parseInt(s[i++]));

        q=Integer.parseInt(bu.readLine());
        StringBuilder sb=new StringBuilder();
        while(q-->0)
        {
            String o=bu.readLine();
            if(o.equals("Insert")) 
            {
                s=bu.readLine().split(" ");
                i=Integer.parseInt(s[0]);
                int x=Integer.parseInt(s[1]);
                l.add(i,x);
            }
            else
            {
                i=Integer.parseInt(bu.readLine());
                l.remove(i);
            }
        }
        
        for(i=0;i<l.size();i++)
        sb.append(l.get(i)+" ");
        System.out.print(sb);
    }
}
