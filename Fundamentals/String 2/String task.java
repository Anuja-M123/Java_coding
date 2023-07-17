/* QUESTION:
Petya started to attend programming lessons. On the first lesson, his task was to write a simple program. The program was supposed to do the following: in the given string, consisting of uppercase and lowercase letters, it:

Deletes all the vowels.
Inserts a character "." before each consonant.
Replaces all uppercase consonants with corresponding lowercase ones.
Vowels are letters "A", "O", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string. Write a program to help Petya cope with this easy task.



INPUT & OUTPUT FORMAT:
The first line represents the input string of Petya's program. This string only consists of uppercase and lowercase letters and its length is from 1 to 20, inclusive.
The output is to print the resulting string. It is guaranteed that this string is not empty.
[All text in bold represents the input and the rest represents the output.]
SAMPLE INPUT & OUTPUT 1:
Enter the string
tour
The resultant string
.t.r
SAMPLE INPUT & OUTPUT 2:

Enter the string
aBAcAba
The resultant string
.b.c.b*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string");
     String anu=sc.next();
     anu=anu.toLowerCase().replace("a","").replace("e","").replace("i","").replace("o","").replace("u","").replace("/'","");
     System.out.println("The resultant string");
     for(int i=0;i<anu.length();i++){
         System.out.print("."+anu.charAt(i));
     }
    }
}
