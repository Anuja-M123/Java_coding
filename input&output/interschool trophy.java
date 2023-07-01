/*It was in the 1997-98 season that Ranchi saw the rise of the Captain Cool in the interschool trophy between DAV Jawahar Vidhya Mandir and Kendriya School. It was in that match Dhoni convinced Banerjee to be the opener and justified it with a double century.

Write a program to display the details of the match with Team name, Scores of the team and Overs played.

Input and Output Format:

Refer sample input and output for formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output]

Sample Input and Output:

Team 1:

Team Name:

DAV Jawahar Vidhya Mandir

Score:

150

Overs played:

20

Team 2:

Team name:

Kendriya School

Score:

110

Overs played:

18

Match Details:

Team 1:

Name: DAV Jawahar Vidhya Mandir

Score: 150

Overs played: 20

Team 2:

Name:  Kendriya School

Score: 110

Overs played: 18*/
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
     String i,j,a,b,c,d;
     Scanner sc = new Scanner(System.in);
     System.out.println("Team 1:");
     System.out.println("Team Name:");
     i = sc.nextLine();
     System.out.println("Score:");
     a=sc.nextLine();
     System.out.println("Overs played:");
     b=sc.nextLine();
     System.out.println("Team 2:\nTeam Name:");
     j = sc.nextLine();
     System.out.println("Score:");
     c=sc.nextLine();
     System.out.println("Overs played:");
     d=sc.nextLine();
     System.out.println("Match Details:");
     System.out.println("Team 1:");
     System.out.println("Name: "+i);
     System.out.println("Score: "+a);
     System.out.println("Overs played: "+b);
     System.out.println("Team 2:");
     System.out.println("Name: "+j);
     System.out.println("Score: "+c);
     System.out.println("Overs played: "+d);
    }
}
