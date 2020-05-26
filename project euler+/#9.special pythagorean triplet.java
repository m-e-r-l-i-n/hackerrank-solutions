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
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine()),i,j,k,f=0;
            int p=-1;
            if(n%2==1) {sb.append("-1\n"); continue;}
            
            for(j=1;j<n/2;j++)
            if(n*(n/2-j)%(n-j)==0)
            {
                i=n*(n/2-j)/(n-j);
                k=n-i-j;
                if(i*i+j*j==k*k && i*j*k>p) p=i*j*k;
            }
            sb.append(p+"\n");
        }
        System.out.print(sb);
    }
}
