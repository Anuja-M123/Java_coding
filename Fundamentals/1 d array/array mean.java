/*Write a program to find the mean of the elements in the array.

Input and Output Format:

Input consists of n+1 integers where n corresponds to the number of elements in the array.

The first integer corresponds to n and the next n integers correspond to the elements in the array.

Output consists of a double value which corresponds to the mean of the array. It is printed upto 2 digits of precision.

Assume that the maximum number of elements in the array is 20.

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

 

Sample Input and Output :

 

Enter the number of elements in the array

5

Enter the elements in the array

2

4

1

3

5

The mean of the array is 3.00*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int i,n;
        float x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        System.out.println("Enter the elements in the array");
        int arr[]=new int[n];
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        x=0f;
        for(i=0;i<n;i++){
            x=x+arr[i];
        }
        System.out.printf("The mean of the array is %.2f",x/n);
    }
}
