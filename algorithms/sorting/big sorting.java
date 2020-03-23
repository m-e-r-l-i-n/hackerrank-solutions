problem link-https://www.hackerrank.com/challenges/big-sorting/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String[] bigSorting(String[] unsorted) {
        Arrays.sort(unsorted);
        Arrays.sort(unsorted,new Comparator<String>(){
        public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
        }});
        return unsorted;
    }

   
    public static void main(String[] args) throws IOException {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine());
        
        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            unsorted[i] = bu.readLine();
        }

        String[] result = bigSorting(unsorted);

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < result.length; i++) 
        sb.append(result[i]+"\n");
        System.out.print(sb);
    }
}
