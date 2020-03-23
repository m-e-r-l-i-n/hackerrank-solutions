problem link-https://www.hackerrank.com/challenges/gem-stones/problem

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the gemstones function below.
    static int gemstones(String[] arr) 
    {
    int i,j,k,v=-1,l=arr[0].length(),g2[]=new int[26],c=0;
    char g1[]=new char[26];
    for(i=0;i<26;i++)
    {
        g1[i]=(char)(97+i);
        g2[i]=0;
    }
    for(i=0;i<l;i++)
        for(j=0;j<26;j++)
            if(g1[j]==arr[0].charAt(i)) g2[j]+=1;
    for(i=0;i<26;i++)
        if(g2[i]>0) ++c;
    char s[]=new char[c];
    for(i=0;i<26;i++)
        if(g2[i]>0) s[++v]=g1[i];
    
    int ci[]=new int[c];
    for(i=0;i<c;i++)
    ci[i]=0;
    v=0;
       
    for(i=1;i<arr.length;i++)
    {
            for(k=0;k<c;k++)
            for(j=0;j<arr[i].length();j++)
            if(arr[i].charAt(j)==s[k])  {++ci[k];break;}
    }
    for(i=0;i<c;i++)
    if(ci[i]==arr.length-1) ++v;
    return v;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
