problem link-https://www.hackerrank.com/challenges/time-conversion/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        int i=Integer.parseInt(s.substring(0,2));
        String j=s.substring(s.length()-2);
        if(j.equalsIgnoreCase("pm")&& i<12)
        i=i+12;
        if(j.equalsIgnoreCase("am")&& i==12)
        i=0;
        String w;
        if(i<10)
        w="0"+Integer.toString(i)+s.substring(2,s.length()-2);
        else
        w=Integer.toString(i)+s.substring(2,s.length()-2);
        
        return w; 
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
