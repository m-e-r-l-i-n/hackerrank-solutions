import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            String s=bu.readLine();
            int x=countRomanValue(s);
            String r=number2roman(x);
            sb.append(r+"\n");

        }
        System.out.print(sb);
    }

    static int countRomanValue(String s)
    {
        Object[][] number={
                {"M" , 1000},
                {"CM",  900},
                {"D" ,  500},
                {"CD",  400},
                {"C" ,  100},
                {"XC",   90},
                {"L" ,   50},
                {"XL",   40},
                {"X" ,   10},
                {"IX",    9},
                {"V" ,    5},
                {"IV",    4},
                {"I" ,    1},
        };
        int res=0;
        while(s.length()>0)
        {
            for(Object[] n : number)
            {
                String numeral=(String)n[0];
                if(s.startsWith(numeral))
                {
                    res+=(Integer)n[1];
                    s=s.substring(numeral.length());
                    break;
                }
            }
        }
        return res;
    }

    static String number2roman(int number)
    {
        int i,rules[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String action[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I" };
        String res="";
        for(i=0;i<13;i++)
        while(number>=rules[i])
        {
            number-=rules[i];
            res+=action[i];
        }
        return res;
    }
}
