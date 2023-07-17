/* A symmetric matrix is a square matrix that is equal to its transpose.
Write a program to find whether a given matrix is a square matrix or not.

Input Format:
The input consists of (m*n+2) integers. The first integer corresponds to m, the number of rows in the matrix and the second integer corresponds to n, the number of columns in the matrix. The remaining integers correspond to the elements in the matrix. The elements are read in rowwise order, first row first, then second row and so on. Assume that the maximum value of m and n is 10.

Output Format:
Refer sample output for details.

Sample Input 1:
2
2
4 5
5 4

Sample Output 1:
Symmetric*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    if(m!=n){
        System.out.println("No Symmetric");}
    else{
    int[][] arr=new int[m][n];
    int[][] arr1=new int[n][m];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr1[j][i]=arr[i][j];
    }}for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j]!=arr1[i][j]){
                System.out.println("Not Symmetric");
                return;
            }
        }}
        System.out.println("Symmetric");
    }}}
    
