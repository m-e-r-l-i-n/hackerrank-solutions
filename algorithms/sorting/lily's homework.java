import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the lilysHomework function below.
    static int lilysHomework(int[] a) {
        int i,n=a.length,b[]=new int[n],t[]=new int[n];
        HashMap<Integer,Integer> c=new HashMap<>();
        HashMap<Integer,Integer> ct=new HashMap<>();
        for(i=0;i<n;i++)
        {
            b[i]=a[i];
            t[i]=b[i];
            c.put(a[i],i);
            ct.put(a[i],i);
        }
        Arrays.sort(b);

        int cnt1=0,cnt2=0;
        for(i=0;i<n;i++)
        if(a[i]!=b[i])
        {
            cnt1++;
            int p1=i,p2=c.get(b[i]);
            a[p1]=a[p1]^a[p2]^(a[p2]=a[p1]);
            c.put(a[p2],p2);
        }

        for(i=0;i<n/2;i++)
        b[i]=b[i]^b[n-i-1]^(b[n-i-1]=b[i]);
        for(i=0;i<n;i++)
        a[i]=t[i];
        c=new HashMap<>();
        for(int x:ct.keySet())
        c.put(x,ct.get(x));

        for(i=0;i<n;i++)
        if(a[i]!=b[i])
        {
            cnt2++;
            int p1=i,p2=c.get(b[i]);
            a[p1]=a[p1]^a[p2]^(a[p2]=a[p1]);
            c.put(a[p2],p2);
        }
        return Math.min(cnt1,cnt2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = lilysHomework(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
