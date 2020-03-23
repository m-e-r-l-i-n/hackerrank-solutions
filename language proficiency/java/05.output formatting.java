import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                String xs=sc.next();
                if(xs.length()<3)
                for(int j=0;j<=(3-xs.length());j++)
                xs='0'+xs;
                for(int j=s1.length();j<15;j++)
                s1+=" ";
                System.out.println(s1+xs);
            }
            System.out.println("================================");

    }
}



