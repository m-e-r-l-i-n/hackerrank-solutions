import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws Exception
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String s1=bu.readLine(),s2=bu.readLine();
        BigInteger a=new BigInteger(s1),b=new BigInteger(s2);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

    }
}

