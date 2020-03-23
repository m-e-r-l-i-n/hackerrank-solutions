import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine()),i;
        ArrayList[] set = new ArrayList[n];
    
        for(i=0;i<n;i++)
        {
            String s[]=bu.readLine().split(" ");
            set[i]=new ArrayList();
            int c=Integer.parseInt(s[0]);
            for(int j=1;j<=c;j++)
            set[i].add(Integer.parseInt(s[j]));
        }
        int q=Integer.parseInt(bu.readLine());
        StringBuilder sb=new StringBuilder();
        for(i=0;i<q;i++)
        {
            String s[]=bu.readLine().split(" ");
            int x=Integer.parseInt(s[0])-1, y=Integer.parseInt(s[1])-1;
            try{
            sb.append(set[x].get(y)+"\n");
            } 
            catch(Exception e)
            {
            sb.append("ERROR!\n");
            }
        }
        System.out.print(sb);

    }
}

