problem link-https://www.hackerrank.com/challenges/missing-numbers/problem?h_r=internal-search

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,i,d,result[]=new int[201];
        
        n=sc.nextInt();
        int A[]=new int[n];
        for(i=0; i<A.length; i++)
        A[i]=sc.nextInt();
                
        m=sc.nextInt();
        int B[]=new int[m];
        for(i= 0; i<B.length; i++)
        B[i]=sc.nextInt();
        
        int pivot=A[0];
        
        for(i=0; i<n; i++)
        {   d=A[i]-pivot;
            result[100+d]--;
        }
        
        for(i=0; i<m; i++) 
        {   d=B[i]-pivot;
            result[100+d]++;
        }
        
        for(i=0; i<result.length; i++) 
        {  
            int value = i-100+pivot;
            if(result[i]>0)
                System.out.print(value+" ");
        }
        
    sc.close();
        
    }

}
