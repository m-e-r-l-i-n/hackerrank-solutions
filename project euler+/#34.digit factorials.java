import java.io.*;
public class Euler
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int fac[]={1,1,2,6,24,120,720,5040,40320,362880};    //0!-10!
        int i,N;
        N=Integer.parseInt(bu.readLine());
        long sum=0;
        for(i=10;i<=N;i++)
        if(factorialeq(fac,i)) sum+=i;
        System.out.print(sum);
    }

    static boolean factorialeq(int fac[],int n)
    {
        int no=n,s=0;
        while(no!=0)
        {
            s+=fac[no%10];
            no/=10;
        }
        if(s%n==0) return true;
        else return false;
    }
}
