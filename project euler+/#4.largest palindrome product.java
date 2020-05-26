import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws Exception {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> p=new ArrayList<>();
        int i,j;
        for(i=100;i<1000;i++)
        for(j=100;j<1000;j++)
        if(palin(i*j)) p.add(i*j);
        Collections.sort(p);
        int t=Integer.parseInt(bu.readLine());
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine());
            int ans=0;
            for(i=0;i<p.size();i++)
            if(p.get(i)<n) ans=p.get(i);
            else break;
            sb.append(ans+"\n");
        }
        System.out.print(sb);
    }

    static boolean palin(int n)
    {
        char s[]=Integer.toString(n).toCharArray();
        for(int i=0;i<s.length/2;i++)
            if(s[i]!=s[s.length-1-i]) return false;
        return true;
    }
}
