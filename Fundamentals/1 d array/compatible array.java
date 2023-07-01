/* 2 arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all i. Write a  program to find whether 2 arrays are compatible or not.

Input Format:

Input consists of 2n+1 integers. The first integer corresponds to ‘n’ , the size of the array. The next ‘n’ integers correspond to the elements in the first array. The last 'n' integers correspond to the elements in the second array. Assume that the maximum value of n is 15.

Output Format:

Refer sample output for details.

Sample Input :

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

Sample Output :

Compatible

*/
         import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    //get two arrays
    int size=sc.nextInt();
    int arr[]=new int[size];
    int arr1[]=new int[size];
    int n=size;
    //get values for two arrays
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
  
    for(int i=0;i<size;i++){
        arr1[i]=sc.nextInt();
    }
    //int a = 0;
    for(int i=0;i<size;i++){
        if(arr[i]<arr1[i]){
            System.out.println("Incompatible");
            break;
        }
        if(arr[i]>=arr1[i]&&arr[n-1]>=arr1[n-1]){
            System.out.println("Compatible");
           break; 
    }
    }
        }
}

