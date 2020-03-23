problem link-https://www.hackerrank.com/challenges/jesse-and-cookies/problem?h_r=internal-search

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class Solution {

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int operations=0;
        PriorityQueue<Integer> que=new PriorityQueue<Integer>();
        
        for(int i=0; i<n; i++)
            que.add(sc.nextInt());
        
        while(que.size()>1 && que.peek()<k) 
        {
            int leastSweet = que.poll();
            int secondLeast = que.poll();
            
            que.add(leastSweet + 2*secondLeast);
            operations++;
        }
        
       
        if(que.peek()<k) 
            System.out.print(-1);
        else
            System.out.print(operations);        
    }
}
