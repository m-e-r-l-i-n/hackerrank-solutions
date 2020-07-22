problem link-https://www.hackerrank.com/challenges/poisonous-plants/problem

import java.io.*;
import java.util.*;

public class Solution {

    // Complete the poisonousPlants function below.
    static int poisonousPlants(int[] p) {
        int i,ans=0;
        Stack<Pair> s=new Stack<>();
        for(i=0;i<p.length;i++)
        {
            int d=0;
            while(!s.isEmpty() && p[s.peek().a]>=p[i])
            d=Math.max(d,s.pop().b);
            if(s.isEmpty()) s.push(new Pair(i,0));
            else
            {
                ans=Math.max(ans,d+1);
                s.push(new Pair(i,d+1));
            }
        }
        return ans;
    }

    static class Pair
    {
        int a,b;
        Pair(int x,int y)
        {
            a=x;
            b=y;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int result = poisonousPlants(p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
