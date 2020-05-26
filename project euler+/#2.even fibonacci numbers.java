import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws Exception {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Long> al=new ArrayList<>();
        long ans=0,s=0,a=1,b=1;
        while(ans<=40000000000000000l)
        {
            s=a+b;
            if(s%2==0) {ans+=s; al.add(s);}
            a=b;
            b=s;
        }
        int t=Integer.parseInt(bu.readLine());
        //System.out.print(al);
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            long n=Long.parseLong(bu.readLine());
            ans=0;
            for(int i=0;i<al.size();i++)
            if(al.get(i)<=n) ans+=al.get(i);
            else break;
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
