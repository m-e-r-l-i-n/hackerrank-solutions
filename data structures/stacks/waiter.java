problem link-https://www.hackerrank.com/challenges/waiter/copy-from/149237100

//the question is tough because of its language and not its logic
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the waiter function below.
     */
    static int[] waiter(int[] number, int q) {
        /*
         * Write your code here.
         */
        int p[]=new int[10001],i,j;
        for(i=2;i<=10000;i++)
        if(p[i]==0)
        for(j=2*i;j<=10000;j+=i)
        p[j]=1;

        ArrayList<Integer> pr=new ArrayList<>();
        for(i=2;i<=10000;i++)
        if(p[i]==0) pr.add(i);

        int n=number.length,ans[]=new int[n],top=0;
        for(i=1;i<=q;i++)
        {
            ArrayList<Integer> b=new ArrayList<>();
            int start=0,end=0;
            if(i%2==0)  //note that for even query, we traverse that goddamn A array from right to left
            {
                for(j=n-1;j>=0;j--)
                if(number[j]==-1) continue;
                else if(number[j]%pr.get(i-1)==0) //divisible numbers go, others stay
                {ans[top++]=number[j]; number[j]=-1;}
            }
            else    //vice versa
            {
                for(j=0;j<n;j++)
                if(number[j]==-1) continue;
                else if(number[j]%pr.get(i-1)==0) //divisible numbers go, others stay
                {ans[top++]=number[j]; number[j]=-1;}
            }
        }
        if(top!=n)  //this means not all have been suffled according to the question
        {if(i%2==1)     //same thing here as well
        {
            for(i=n-1;i>=0;i--)
            if(number[i]!=-1) ans[top++]=number[i];
        }
        else
        {
            for(i=0;i<n;i++)
            if(number[i]!=-1) ans[top++]=number[i];
        }}
        
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0].trim());

        int q = Integer.parseInt(nq[1].trim());

        int[] number = new int[n];

        String[] numberItems = scanner.nextLine().split(" ");

        for (int numberItr = 0; numberItr < n; numberItr++) {
            int numberItem = Integer.parseInt(numberItems[numberItr].trim());
            number[numberItr] = numberItem;
        }

        int[] result = waiter(number, q);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
