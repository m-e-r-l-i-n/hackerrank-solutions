problem link-https://www.hackerrank.com/challenges/jim-and-the-jokes/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static long solve(int[][] dates) {
        ArrayList<String> d=new ArrayList<>();
        int i,j;
        for(i=0;i<dates.length;i++)
        if(validCombo(dates[i][0],dates[i][1])) d.add(""+dates[i][0]+" "+dates[i][1]);
        int dd[]=new int[d.size()];
        Object s[]=d.toArray();
        for(i=0;i<d.size();i++)
        {
            String st[]=s[i].toString().split(" ");
            dd[i]=conversion(Integer.parseInt(st[0]),Integer.parseInt(st[1]));
        }
        Arrays.sort(dd);
        
        long c=0;
        for(i=0;i<dd.length-1;i++)
        for(j=i+1;j<dd.length;j++)  //all matching dates are summed up
        if(dd[i]==dd[j]) c++;
        return c;
    }

    static boolean validCombo(int m,int d)  //checks if the date is right
    {
        if(m==1) return false;

        if(m<10)
        {
            while(d>0)
            {
                if(d%10>=m) return false;
                d/=10;
            }
        }
        return true;
    }

    static int conversion(int b,int i)  //all are conveted to decimal
    {
        int ans=0,p=0;
        while(i>0)
        {
            ans+=(int)Math.pow(b,p)*(i%10);
            i/=10;
            p++;
        }
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] dates = new int[n][2];

        for (int datesRowItr = 0; datesRowItr < n; datesRowItr++) {
            String[] datesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int datesColumnItr = 0; datesColumnItr < 2; datesColumnItr++) {
                int datesItem = Integer.parseInt(datesRowItems[datesColumnItr]);
                dates[datesRowItr][datesColumnItr] = datesItem;
            }
        }

        long result = solve(dates);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
