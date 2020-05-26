import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int q=Integer.parseInt(bu.readLine());
        StringBuilder sb=new StringBuilder();
        while(q-->0)
        sb.append("0\n");   //mathematically there are no perfect triangles that are not super perfect
        System.out.print(sb);
    }
}
