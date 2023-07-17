/* QUESTION:
Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.

Let's consider a word too long (Length of the word is strictly more than 10 characters). All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and between them, we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

Thus, "localization" will be spelled as "l10n", and "internationalization» will be spelled as "i18n".

You are suggested to automatize the process of changing the words with abbreviations. All too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.



INPUT FORMAT:
The first line contains an integer n, which corresponds to the number of words.
The next 'n' lines contain 'n' words. All the words consist of lowercase letters and possess the lengths of from 1 to 50 characters.
OUTPUT FORMAT:
The output prints n lines. The i-th line should contain the result of replacing of the i-th word from the input data.
Refer to sample input and output for formatting details.
[All text in bold represents the input and the rest represents the output.]
SAMPLE INPUT & OUTPUT:

Enter the number of words
4
Enter the words
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis
Abbreviation
word
l10n
i18n
p43s*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of words");
    int a=sc.nextInt();
    System.out.println("Enter the words");
    String arr[]=new String[a];
    System.out.println("Abbreviation");
    for(int i=0;i<a;i++){
        arr[i]=sc.next();
        String word=arr[i];
        if(arr[i].length()>10){
            System.out.print(word.charAt(0));
             System.out.print(word.length()-2);
              System.out.print(word.charAt(word.length()-1));
        }else{ 
            System.out.print(word);
        }
         System.out.println();
    }
    }
}
