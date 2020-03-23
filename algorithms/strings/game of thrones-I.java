problem link-https://www.hackerrank.com/challenges/game-of-thrones/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        int c[]=new int[26],i,o=0;
        for(i=0;i<s.length();i++)
        c[s.charAt(i)-97]++;

        for(i=0;i<26;i++)
        {
            if(c[i]%2==1) o++;
            if(o>1) break;
        }
        
        if(o>1) return "NO";
        else return "YES";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
