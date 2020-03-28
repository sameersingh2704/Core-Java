/* Program to find transpose of matrix
 * Submitted By:Sameer Singh
 * CSE-D
 * 1703310170
 */
import java.util.Scanner;

public class TransposeOfMatrix {
	  public static void main(String args[])    
	    {  
	    int i, j;  
	    System.out.println("Enter  r and c ");  
	    Scanner s = new Scanner(System.in);  
	    int r = s.nextInt();  
	    int c = s.nextInt();  
	    int array[][] = new int[r][c];  
	    System.out.println("Enter matrix:");  
	    for(i = 0; i < r; i++)  
	    {  
	        for(j = 0; j < c; j++)   
	            {  
	            array[i][j] = s.nextInt();  
	            System.out.print(" ");  
	            }  
	    }  
	    System.out.println("The matrix before Transpose : ");  
	    for(i = 0; i < r; i++)  
	        {  
	            for(j = 0; j < c; j++)  
	            {  
	            System.out.print(array[i][j]+" ");  
	            }  
	            System.out.println(" ");  
	        }  
	    System.out.println("The  matrix after Transpose : ");  
	    for(i = 0; i < c; i++)  
	        {  
	            for(j = 0; j < r; j++)  
	            {  
	                System.out.print(array[j][i]+" ");  
	            }  
	            System.out.println(" ");  
	        }  
	    }  

}
