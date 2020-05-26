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
            int n=Integer.parseInt(bu.readLine())-1;
            long three=n/3,five=n/5,fif=n/15;
            three=3l*three*(three+1)/2;
            five=5l*five*(five+1)/2;
            fif=15l*fif*(fif+1)/2;
            sb.append(three+five-fif+"\n");
        }
        System.out.print(sb);
    }
}
