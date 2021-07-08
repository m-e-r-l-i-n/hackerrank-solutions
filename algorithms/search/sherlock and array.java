//problem link-https://www.hackerrank.com/challenges/sherlock-and-array/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) 
    {
      int n=arr.size(),i=0,j=n-1,l=0,r=0;
      while ( i<n && j>=0)
      {
            if (l==r && i==j) return "YES";
            if (l>r)
            {r+= arr.get(j);j--;}
            else
            {l+= arr.get(i);i++;}
      }
      if(l==r) return "YES";
      else return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        for (int TItr = 0; TItr < T; TItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr.add(arrItem);
            }

            String result = balancedSums(arr);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}






static String balancedSums(List<Integer> arr)
    {
        int i,j,sl,sr;
        String s="NO";
        for(i=0;i<arr.size();i++)
        {
        sl=0;sr=0;
        for(j=0;j<i;j++)
        sl=sl+arr.get(j);
        for(j=i+1;j<arr.size();j++)
        sr=sr+arr.get(j);
        if(sl==sr)
        {s="YES";break;}
        }
        
        return s; 
    }
