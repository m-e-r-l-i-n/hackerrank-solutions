problem link-https://www.hackerrank.com/challenges/magic-square-forming/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        String sq[]={"816357492","618753294","492357816","294753618","834159672",
        "438951276","672159834","276951438"};   //can be generated using brute force as well where we generate all squares using loop inside loop to check all possibilities
        int min=1000,i,j;
        String st="";
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        st+=""+(char)(s[i][j]+48);

        for(i=0;i<8;i++)
        {
            int temp=0;
            for(j=0;j<9;j++)
                if(st.charAt(j)!=sq[i].charAt(j)) 
                temp+=Math.abs(st.charAt(j)-sq[i].charAt(j));
            if(temp<min) min=temp;
        }
        return min;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
