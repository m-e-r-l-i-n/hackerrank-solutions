import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args)throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String c=bu.readLine();
        
        /*
        Diatomic series is what is being used here
        we need to count the number of zeros between two consecutive ones
        However, the count is only valid when the number is even, which means we have to remove all the set bits from the right
        formula-
        fi(x)=fi-1(x)+zeroes(x)* Σ fk(x)
                               k=1..i
        */
        
        BigInteger n=new BigInteger(c);
        BigInteger zero=new BigInteger("0");
        BigInteger two=new BigInteger("2");
        while(n.testBit(0)) n=n.divide(two);   //the rightmost set bits are not required
        ArrayList<Long> z=new ArrayList<>();
        long cn=0;
        while(n.equals(zero)==false)
        {
            if(n.testBit(0)==false) cn++;    //we are getting the binary representation of the number
            else
            {
                z.add(cn);
                cn=0;
            }
            n=n.divide(two);
        }
        Collections.reverse(z);
        long sum=1,res=1;
        for(int i=0;i<z.size();i++)
        {
            res+=sum*z.get(i);
            sum+=res;
        }
        System.out.print(res);
    }
}
