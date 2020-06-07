problem link-https://www.hackerrank.com/challenges/xor-se/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(bu.readLine());
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            String s[]=bu.readLine().split(" ");
            long l=Long.parseLong(s[0]),r=Long.parseLong(s[1]);
            sb.append((func(r)^func(l-1))+"\n");
        }
        System.out.print(sb);
    }

    static long func(long x)    //g(x)=f(1) f(2)...f(x) where f(x)=xor of all 1-n
    {
        long a=x%8; //check pattern
        if(a==0 || a==1) return x;
        if(a==2 || a== 3) return 2;
        if(a==4 || a==5) return x+2;
        if(a==6 || a==7) return 0;
        return 0;
    }
}
