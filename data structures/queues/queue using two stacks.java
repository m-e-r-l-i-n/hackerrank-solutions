problem link-https://www.hackerrank.com/challenges/queue-using-two-stacks/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a[]=new int[100000],is=0,ie=0;
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0)
        {
            int c=sc.nextInt();
            switch(c)
            {
                case 1:int k=sc.nextInt();
                        a[ie++]=k; break;
                case 2:is++;break;
                case 3:System.out.println(a[is]);
            }

        }
    }
}

