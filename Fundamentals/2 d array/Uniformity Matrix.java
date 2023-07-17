/* Uniformity matrix is a matrix in which all the elements in the matrix are either completely even or completely odd.

Write a program to find whether a given matrix is a uniformity matrix or not.

 Input Format:

The input consists of (n*n+1) integers. The first integer corresponds to the number of rows/columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 5.

Output Format:

Print yes if it is a uniformity matrix. Print no if it is not a uniformity matrix.

 Sample Input 1:

2

4 5

5 4

Sample Output 1:

no

*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }}
            int even=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j]%2==0){
                        even++;
                    }
                }}
                if(even==n*n|| even==0){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }}}
