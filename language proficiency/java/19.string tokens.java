import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine().trim();
        // Write your code here.
        if(s.length()==0)
        {System.out.print(0); return;}
        String delims="[ !,?.\\_'@]+";
        String[] st=s.split(delims);
        System.out.println(st.length);
        for(int i=0;i<st.length;i++)
        System.out.println(st[i]);
        scan.close();
        
    }
}

