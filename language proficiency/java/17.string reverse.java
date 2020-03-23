import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int k=0;
        for(int i=0;i<=s.length()/2;i++)
        if(s.charAt(i)==s.charAt(s.length()-i-1)) continue;
        else
        {k=1; break;}
        if(k==0)
        System.out.print("Yes");
        else
        System.out.print("No");        
    }
}



