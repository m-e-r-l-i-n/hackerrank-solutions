problem link-https://www.hackerrank.com/challenges/qheap1/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int q=Integer.parseInt(bu.readLine()),min=1000000007;
        StringBuilder sb=new StringBuilder();
        ArrayList<Integer> heap=new ArrayList<>();
        while(q-->0)
        {
            String s=bu.readLine();
            char c=s.charAt(0);
            int x=0;
            if(c=='1' || c=='2') x=Integer.parseInt(s.substring(2));
            if(c=='1')
            {
                if(x<min) min=x;
                heap.add(x);
            }
            if(c=='2')
            {
                Integer t=x;
                heap.remove(t);
                if(x==min) 
                {
                    min=1000000007;
                    for(int i=0;i<heap.size();i++)
                    if(heap.get(i)<min) min=heap.get(i);
                }
            }
            if(c=='3')
            sb.append(min+"\n");
        }
        System.out.print(sb);
    }
}
