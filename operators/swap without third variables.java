/*Write a java program to swap two values without the use of 3rd variable.

Input format:

First input: an integer

Second input: an integer

Output format:

The output will be integers(swapped values)
Sample Input:

10

20

Sample Output:

20

10

*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.print(y);
    }
}
