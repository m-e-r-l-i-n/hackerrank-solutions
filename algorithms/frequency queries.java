//problem link-https://www.hackerrank.com/challenges/frequency-queries/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int N=100000,c[]=new int[N+1];
        List<Integer> ans=new ArrayList<>();
        for(List<Integer> q:queries)
        {
            int ty=q.get(0),v=q.get(1);
            if(ty==1)
            {
                int ex=hm.getOrDefault(v,0);
                c[ex]--;
                ex++;
                c[ex]++;
                hm.put(v,ex);
            }
            else if(ty==2 && hm.get(v)!=null)
            {
                int ex=hm.get(v);
                c[ex]--;
                ex--;
                c[ex]++;
                if(ex==0) hm.remove(v);
                else hm.put(v,ex);
            }
            else if(ty==3)
            {
                if(v<=N && c[v]>0) ans.add(1);
                else ans.add(0);
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        bufferedWriter.write(
            ans.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
