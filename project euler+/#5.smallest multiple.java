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
        ArrayList<Integer> p=new ArrayList<>();
        int com[]=new int[41],i,j;
        for(i=2;i*i<=40;i++)
        if(com[i]==0)
        for(j=2;j*i<=40;j++)
        com[j*i]=1;
        for(i=2;i<=40;i++)
        if(com[i]==0) p.add(i);
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine());
            long lcm=1; 
            for(i=0;i<p.size() && p.get(i)<=n;i++) 
            { 
                int pp=p.get(i); 
                while(pp*p.get(i)<=n) pp=pp*p.get(i); 
                lcm*=pp;  
            }
            sb.append(lcm+"\n"); 
        }
        System.out.print(sb);
    }
}
