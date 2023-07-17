/* QUESTION:
Pasha got a very beautiful string s for his birthday, the string consists of lowercase letters. The letters in the string are numbered from 1 to |s| from left to right, where |s| is the length of the given string.

Pasha didn't like his present very much so he decided to change it. After his birthday Pasha spent m days performing the following transformations on his string — each day he chose an integer ai and reversed a piece of string (a segment) from position ai to position |s| - ai + 1. It is guaranteed that 2·ai ≤ |s|.

Write a program to determine what Pasha's string will look like after m days.



INPUT & OUTPUT FORMAT:
The first line of the input contains Pasha's string s of length from 2 to 25 characters, consisting of lowercase letters.
The second line contains a single integer m, which corresponds to the number of days when Pasha changed his string.
The third line contains m space-separated elements ai, which corresponds to the position from which Pasha started transforming the string on the i-th day.
The output is to print what Pasha's string s will look like after m days.
[All text in bold represents the input and the rest represents the output.]
SAMPLE INPUT & OUTPUT 1:

Enter the Pasha's string
abcdef
Enter the number of days
1
Enter the position from which Pasha started transforming
2
The resultant string
aedcbf
SAMPLE INPUT & OUTPUT 2:
Enter the Pasha's string
vwxyz
Enter the number of days
2
Enter the position from which Pasha started transforming
2 2
The resultant string
vwxyz*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Pasha's string");
        String s=sc.nextLine();
        System.out.println("Enter the number of days");
        int m=sc.nextInt();
        System.out.println("Enter the position from which Pasha started transforming");
        int[] positions=new int[m];
        for(int i=0;i<m;i++){
            positions[i]=sc.nextInt();
            
        }
        String result =transformString(s,m,positions);
        System.out.println("The resultant string");
        System.out.println(result);
    }
    private static String transformString(String s,int m,int[] positions){
        char[] chars=s.toCharArray();
        for(int i=0;i<m;i++){
            int ai=positions[i];
            int start =ai - 1;
            int end=chars.length -ai;
            while(start<end){
                char temp=chars[start];
                chars[start]=chars[end];
                chars[end]=temp;
                start++;
                end--;
                
            }
        }
        return new String(chars);
        
    }
}
