problem link-https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] e, int d) {
        int i,count[]=new int[201],x=d/2+1,n=0;
        for(i=0;i<d;i++)
        count[e[i]]++;
        
        for(i=d;i<e.length;i++)
        {
            int median1=0,median2=0,cnt=0,cnt2=0,j;
            if(d%2==1)
            {
                for(j=0;j<=200;j++)
                {cnt+=count[j];
                if(cnt>=x) break;}
                median1=j;
                if(2*median1<=e[i]) n++;
            } 
            
            if(d%2==0)
            {
                int t=0;
                for(j=0;j<=200;j++)
                {cnt+=count[j];
                if(t==0) 
                {cnt2+=count[j];      //important because not everytime will median left needs to be calculated and left untouched until median right is found
                if(cnt2>=x-1) {t=1;cnt2=j;}}
                if(cnt>=x) break;}
                median1=j;
                median2=cnt2;
                median1=median1+median2;  //(m1+m2)/2 *2=m1+m2
                if(median1<=e[i]) n++;
            }

            count[e[i-d]]--;
            count[e[i]]++;
        }
        return n;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
