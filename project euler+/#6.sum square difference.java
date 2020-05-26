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
            int n=Integer.parseInt(bu.readLine());
            long ans=(long)Math.pow(n*(n+1)/2,2)-1l*n*(n+1)*(2*n+1)/6;
            sb.append(ans+"\n"); 
        }
        System.out.print(sb);
    }
}
