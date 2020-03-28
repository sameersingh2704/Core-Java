/* Program to Calculate percentage of a students marks
 * Submitted By:Sameer Singh
 * CSE-D
 * 1703310170
 */
import java.util.*;
 class CalculatePercentage
{
	 public static void main(String[] args) 
		{	
			int totalSubjects, i;
		    float Marks, total = 0, Percentage, Average;
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" Enter the Total Number of Subjects : ");
			totalSubjects = sc.nextInt();
			
			System.out.print(" Enter the Subjects Marks : ");
			for(i = 0; i < totalSubjects; i++)
			{
				Marks = sc.nextInt();
				total = total + Marks;
			}
		
			Average = total / totalSubjects;
		    Percentage = (total / (totalSubjects * 100)) * 100;
		    
		    System.out.println(" Total Marks =  " + total);
		    System.out.println(" Average Marks =  " + Average);
		    System.out.println(" Marks Percentage =  " + Percentage);
		}
}

