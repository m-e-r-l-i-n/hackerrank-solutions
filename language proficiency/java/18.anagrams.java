import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int ac[]=new int[26],bc[]=new int[26],i;
        for(i=0;i<a.length();i++)
        ac[Character.toUpperCase(a.charAt(i))-65]++;
        for(i=0;i<b.length();i++)
        bc[Character.toUpperCase(b.charAt(i))-65]++;
        boolean t=true;
        for(i=0;i<26;i++)
        if(ac[i]!=bc[i]) {t=false; break;}
        return t;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
