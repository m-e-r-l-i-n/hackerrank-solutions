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
            long n=Long.parseLong(bu.readLine());
            long i,lar=0;
            for(i=2;i*i<=n;i++)
            if(n%i==0)
            {
                while(n%i==0) n/=i;
                lar=i;
            }
            if(n>=2) lar=n;
            sb.append(lar+"\n");
        }
        System.out.print(sb);
    }
}
