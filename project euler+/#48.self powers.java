import java.io.*;

public class Solution
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        long res=0,M=10000000000l,m=100000000; int i,j;
        int n=Integer.parseInt(bu.readLine());
        for(i=1;i<=n;i++)
        {
            Num t=power(i,i,m);
            long x=t.b+m*t.a;
            res+=x;
            res%=M;
        }
        System.out.print(res);
    }

    static Num power(long base, int p,long m)
    {
        if(p==0) return new Num(0,1);
        if(p==1) return new Num(0,base);
        if(p%2==0)
        {
            Num x=power(base, p/2,m);
            //x^2 = a*a*m*m + 2*a*m*b + b*b
            long z=2l*(x.a*m)*x.b+x.b*x.b;
            x.b=z%m;
            x.a=z/m;
            x.a%=100;
            return x;
        }
        else
        {
            Num x=power(base,p-1,m);
            long z=(x.b+m*x.a)*base;
            x.a=z/m;
            x.b=z%m;
            x.a%=100;
            return x;
        }
    }

    static class Num    //why num? 10^10*10^10=10^20>long
    {
        long a,b;
        Num(long x,long y)
        {
            a=x;
            b=y;
        }
    }
}
