/* Create a Java class named 'Main' that demonstrates function overloading:

Define a method named 'multiply' that takes two integer parameters 'num1' and 'num2' and returns their product as an integer value.
Overload the 'multiply' method by defining a second method named 'multiply' that takes two double parameters 'num1' and 'num2' and returns their product as a double value.
Input Format
Input two Integers in a separate line & two Double in a separate line.

Output Format
One Integer value and Double value after performing multiplication in a separate line.

Sample Input
2
3
1.2
2.3
Sample Output
6
2.76
Sample Input
4
5
1.5
3.4
Sample Output
20
5.1
*/

import java.util.Scanner;
class Mainn{
    public static void multiply(int num1,int num2){
        System.out.println(num1*num2);
    }
    public static void multiply(double num11,double num22){
        System.out.println(num11*num22);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        double num11=sc.nextDouble();
        double num22=sc.nextDouble();
        Mainn ma=new Mainn();
        ma.multiply(num1,num2);
        ma.multiply(num11,num22);
        
      // ma.multiply();
    }
}
