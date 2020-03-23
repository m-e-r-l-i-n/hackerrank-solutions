import java.io.*;
import java.util.*;

public class Solution
{
public static void main(String args[])throws Exception
{
    BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(bu.readLine());
    Map <String,Integer> m=new HashMap<>();
    while(t-->0)
    {
        String s[]=bu.readLine().split(" ");
        if(s[0].equals("add"))
            for(int i=1;i<=s[1].length();i++)
            {
                String st=s[1].substring(0,i);
                if(m.get(st)==null)
                m.put(st,1);
                else m.put(st,m.get(st)+1);
            }
        else
        {
            if(m.get(s[1])!=null)
            System.out.println(m.get(s[1]));
            else
            System.out.println(0);
        }
    }
}
}
