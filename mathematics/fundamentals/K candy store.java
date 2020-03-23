problem link-https://www.hackerrank.com/challenges/k-candy-store/submissions/code/147559708

import java.io.*;
import java.util.*;
import java.math.*;
class Solution
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(bu.readLine());
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine());
            int k=Integer.parseInt(bu.readLine());
            //we need to calculate c(n+k-1,k)
            int i,j=1;
            BigInteger nc=new BigInteger("1");
            BigInteger r=new BigInteger("1");
            BigInteger b=new BigInteger("0");
            for(i=n;i<(n+k);i++)
            {
                nc=nc.multiply(b.valueOf(i));
                if(j<=k) r=r.multiply(b.valueOf(j++));
            }
            for(i=j;i<=k;i++)
            r=r.multiply(b.valueOf(i));
            sb.append(Integer.parseInt(nc.divide(r).mod(b.valueOf(1000000000)).toString())+"\n");
        } 
        System.out.print(sb);
    }
}
