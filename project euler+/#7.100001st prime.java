import java.io.*;
public class Solution
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int N=1000000,i,j,p[]=new int[N+1],c=0,a[]=new int[10000];
        for(i=2;i<=N;i++)   //sieve of Eratosthenes
        if(p[i]==0)
        for(j=2*i;j<=N;j+=i)
            p[j]=1;
        for(i=2;i<=N;i++)
        {
            if(p[i]==0) a[c++]=i;
            if(c==10000) break;
        }
        int t=Integer.parseInt(bu.readLine());
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            int n=Integer.parseInt(bu.readLine())-1;
            sb.append(a[n]+"\n");
        }
        System.out.print(sb);
    }
}
