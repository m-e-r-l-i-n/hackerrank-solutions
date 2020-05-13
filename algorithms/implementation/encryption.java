problem link-https://www.hackerrank.com/challenges/encryption/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String st) {
        int i,j;
        String s="";
        for(i=0;i<st.length();i++)
        if(st.charAt(i)!=' ')s+=st.charAt(i);
        int l=s.length(),c=(int)Math.ceil(Math.sqrt(l));
        char ch[][]=new char[c][c];
        int t=0;
        for(i=0;i<c;i++)
        for(j=0;j<c;j++)
        if(t+1<=s.length()) ch[i][j]=s.charAt(t++);
        String ans[]=new String[c];
        for(i=0;i<c;i++)
        {
            ans[i]="";
            for(j=0;j<c;j++)
            ans[i]+=ch[j][i];
            ans[i]=ans[i].trim();
        }
        String fin="";
        for(i=0;i<c;i++)
        fin+=ans[i]+" ";
        return fin;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
