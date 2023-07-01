/* Ramu have some number of Apples and he arrange that in a matrix format. Raju have some another number of Apples. He also wants to arrange that in a matrix format. Ragul wants to calculate the total number of apples. Help him to find out the total number of apples.

Input Format:

Input consists of 2n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the first array. The last 'n' integers correspond to the elements in the second array. Assume that the maximum value of n is 15.

Output Format:

Refer sample output for details.

Sample Input 1:

5

2

3

6

8

1

1

1

1

1

1

Sample Output 1:

3 4 7 9 2*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    //size declare
    int size=sc.nextInt();
    int x;
    //array declare
    int arr[]=new int[size];
    int arr1[]=new int [size]; 
    //input array  1
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    //input  2
    for(int i=0;i<size;i++){
        arr1[i]=sc.nextInt();
    }
    //output 1
    for(int i=0;i<size;i++){
            x=arr[i]+arr1[i];
            System.out.print(x+" ");
        }
    }
}
