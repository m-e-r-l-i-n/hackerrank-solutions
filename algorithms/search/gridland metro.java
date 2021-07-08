import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),k=Integer.parseInt(s[2]);
        HashMap<Integer,ArrayList<Pair>> hm=new HashMap<>();

        int i;
        for(i=0;i<k;i++)
        {
            s=bu.readLine().split(" ");
            int r=Integer.parseInt(s[0]),c1=Integer.parseInt(s[1]),c2=Integer.parseInt(s[2]);
            if(hm.get(r)==null) hm.put(r,new ArrayList<>());
            hm.get(r).add(new Pair(c1,c2));
        }

        long del=0;
        for(int r:hm.keySet())
        {
            PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    if(o1.l>o2.l) return 1;
                    else if(o1.l==o2.l) return o1.r>o2.r?-1:1;
                    else return -1;
                }});
            for(Pair y:hm.get(r)) pq.add(y);

            int u=pq.peek().l,v=pq.peek().r,cur=0;
            while(!pq.isEmpty())
            {
                Pair p=pq.poll();
                if(p.l>v)
                {
                    cur+=v-u+1;
                    u=p.l;
                    v=p.r;
                }
                else
                {
                    u=Math.min(u,p.l);
                    v=Math.max(v,p.r);
                }
            }
            cur+=v-u+1;
            del+=cur;
        }
        System.out.println(1l*n*m-del);
    }

    static class Pair
    {
        int l,r;
        Pair(int a,int b)
        {
            l=a;
            r=b;
        }
    }
}
