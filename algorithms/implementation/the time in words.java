problem link-https://www.hackerrank.com/challenges/the-time-in-words/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String w1_9[]={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","one"};
        String w11_14[]={"eleven","twelve","thirteen","fourteen"};
        String w16_19[]={"sixteen","seventeen","eighteen","nineteen","twenty"};
        if(m==0) return w1_9[h-1]+" o' clock";
        else if(m==1) return w1_9[0]+" minute past "+w1_9[h-1];
        else if(m<11) return w1_9[m-1]+" minutes past "+w1_9[h-1];
        else if(m<15) return w11_14[m-11]+" minutes past "+w1_9[h-1];
        else if(m==15) return "quarter past "+w1_9[h-1];
        else if(m<21) return w16_19[m-16]+" minutes past "+w1_9[h-1];
        else if(m<30)
        {
            m=m%10;
            return "twenty "+w1_9[m-1]+" minutes past "+w1_9[h-1];
        }
        else if(m==30) return "half past "+w1_9[h-1];
        else if(m<40)
        {
            m=60-m;
            m=m%10;
            return  "twenty "+w1_9[m-1]+" minutes to "+w1_9[h];
        }
        else if(m<45) return w16_19[60-m-16]+" minutes to "+w1_9[h];
        else if(m==45) return "quarter to "+w1_9[h];
        else if(m<50) return w11_14[60-m-11]+" minutes to "+w1_9[h];
        else if(m<59) return w1_9[60-m-1]+" minutes to "+w1_9[h];
        else return w1_9[0]+" minute to "+w1_9[h];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
