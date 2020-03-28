/* Program to print elements of a matrix
 * Submitted By:Sameer Singh
 * CSE-D
 * 1703310170
 */

import java.util.Scanner;
public class ShowMatrix {
	public static void main(String args[])
	   {
	 int row, col, i, j;
	       int arr[][] = new int[10][10];
	       Scanner sc = new Scanner(System.in); 
	       System.out.print("Enter row for the matrix : ");
	       row = sc.nextInt();
	       System.out.print("Enter column for the matrix : ");
	       col = sc.nextInt();
	       System.out.println("Enter " +(row*col)+ " Elements of Matrix : ");
	       for(i=0; i<row; i++)
	       { for(j=0; j<col; j++)
	           { arr[i][j] = sc.nextInt();} }	   
	       System.out.print("The Matrix is :\n");
	       for(i=0; i<row; i++)
	       { for(j=0; j<col; j++)
	           {System.out.print(arr[i][j]+ "  ");
	           }System.out.println();}}}
