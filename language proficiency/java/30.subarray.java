import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine());
        int a[]=new int[n],i,c=0;
        String s[]=bu.readLine().split(" ");
        for(i=0;i<n;i++)
        {a[i]=Integer.parseInt(s[i]);
        if(a[i]<0) c++;}
        int j; long sum=0;
        for(i=0;i<n-1;i++)
        {
            sum=a[i];
            for(j=i+1;j<n;j++)
            {
                sum+=a[j];
                if(sum<0) c++;
            }
        }
        System.out.print(c);
    }
}

