import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the runningMedian function below.
     */
    static double[] runningMedian(int[] a) {
        /*
         * Write your code here.
         */
         PriorityQueue<Integer> max=new PriorityQueue<>();
         PriorityQueue<Integer> min=new PriorityQueue<>(Collections.reverseOrder());    //this line works only in java 8
        //priority queue is being used because it can word based on priority eg-remove max element from any in between position
         min.add(a[0]);
         int i,j,k=0;
         double d[]=new double[a.length],m=a[0];    //m will calculate median
         d[k++]=a[0];
         for(i=1;i<a.length;i++)
         {
             //now we need to keep diff between 2 queue at max 1(heap sort technique)
            int x=a[i];
            //we have 3 cases, max heap> min, <min, =min
            if(min.size()>max.size())
            {
            if(x<m)     //for each of the given cases, we have 2 possibilties, median>a[i] or<a[i]
            {max.add(min.remove());    //min.remove will remove top character and restore order
            min.add(x);} 
            else max.add(x); 
            m=(double)(min.peek()+max.peek())/2;    //root node of max and min gives the median   
            }

            else if(min.size()==max.size()) 
            {
            if(x<m) 
            {min.add(x); m=(double)min.peek();} 
            else
            {max.add(x); m=(double)max.peek();} 
            }
            
            else
            {
            if(x>m) 
            {min.add(max.remove()); max.add(x);} 
            else  min.add(x); 
            m=(double)(min.peek()+max.peek())/2; 
            }

            d[k++]=m;    
         }
        return d;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(scanner.nextLine().trim());

        int[] a = new int[aCount];

        for (int aItr = 0; aItr < aCount; aItr++) {
            int aItem = Integer.parseInt(scanner.nextLine().trim());
            a[aItr] = aItem;
        }

        double[] result = runningMedian(a);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
