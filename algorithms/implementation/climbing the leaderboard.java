problem link-https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        Arrays.sort(scores);
        int i,rank=1,r[]=new int[scores.length];
        int pos[]=new int[alice.length],j,k=0;
        
        if(scores.length==1)
        {
            
            for(i=0;i<alice.length;i++)
            if(alice[i]>=scores[0]) pos[i]=1;

            return pos;
        }
        
        for(i=scores.length-1;i>0;i--)
        {if(scores[i]>scores[i-1]) r[i]=rank++;
        else r[i]=rank;}
        if(scores[0]==scores[1]) r[0]=rank-1;
        else r[0]=rank;
        rank++;
        for(i=0;i<scores.length;i++)
        System.out.print(r[i]);
        for(i=0;i<alice.length;i++)
        {
            for(j=k;j<scores.length;j++)
            if(alice[i]==scores[j]) rank=r[j];
            else if(alice[i]>scores[j]) rank=r[j]-1;
            else {rank=r[j]+1;break;}
            k=j;
            if(rank<=0) rank=1;
            pos[i]=rank;
        }
        return pos;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
