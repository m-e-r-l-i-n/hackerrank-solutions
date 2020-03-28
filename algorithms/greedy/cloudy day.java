problem link-https://www.hackerrank.com/challenges/cloudy-day/copy-from/149753333

import java.io.*;
import java.util.*;
public class Solution
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bu.readLine());
        int i; long k,l;
        String s[]=bu.readLine().split(" ");
        String st[]=bu.readLine().split(" ");
        HashMap<Long,Long> a=new HashMap<Long,Long>();
        for(i=0;i<n;i++)
        {
            l=Long.parseLong(s[i]);
            k=Long.parseLong(st[i]);
            if(a.get(k)==null) a.put(k,l);  //this is necessary because 2 cities are in same location
            else a.put(k,a.get(k)+l);
        }
        n=a.size();
        int t=0,pos[]=new int[n+1]; long max=0,keys[]=new long[n];
        for(long x:a.keySet())
        keys[t++]=x;
        Arrays.sort(keys);  //keys will store city locations which are not same in sorted order
        
        int m=Integer.parseInt(bu.readLine());
        ArrayList<Integer> cl=new ArrayList<>();    //0,2,4 will store start position of clouds, odd will store end
        s=bu.readLine().split(" ");
        st=bu.readLine().split(" ");
        for(i=0;i<m;i++)
        {
            long y=Long.parseLong(s[i]),r=Long.parseLong(st[i]);
            int start=Arrays.binarySearch(keys,y-r),end=Arrays.binarySearch(keys,y+r);
            if(start<0) start=-start-1; //binary search gives positions where new element is supposed to be inserted
            if(end<0) end=-end-2;
            pos[start]++;
            pos[end+1]--;
            cl.add(start); cl.add(end);
        }
        
        for(i=1;i<=n;i++)
        pos[i]+=pos[i-1];   //this is a greedy approach that allows us to find number of clouds over each city
        long pop=0,ans=0,pre[]=new long[n+1];
        for(i=0;i<n;i++)
        {
            if(pos[i]==1) pop+=a.get(keys[i]);  //consider cities with 1 cloud only
            if(pos[i]==0) ans+=a.get(keys[i]);  //add population with 0 clouds
            pre[i+1]=pop;
        }
        
        for(i=0;i<cl.size();i+=2)
        {
            long temp=pre[cl.get(i+1)+1]-pre[cl.get(i)];    //population covered by a cloud(note that pre contains population count of those cities only which have 1 cloud over them)
            if(temp>max) max=temp;
        }
        System.out.print(ans+max);  //0 clouds+max population covering cloud
    }
}
