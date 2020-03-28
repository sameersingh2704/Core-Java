/* Program to transpose a given matrix using CLA
 * Submitted By:Sameer Singh
 * CSE-D
 * 1703310170
 */
public class CLATransposeM {

	public static void main(String args[])
	{
		int i,j, c=0;
		int b[][]=new int [3][3];
		int a[][] = new int[3][3];
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++)
			{
				a[i][j]=Integer.parseInt(args[c]);
				c++;
			}
		}
		System.out.println("Before Transpose of Matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{System.out.print(a[i][j]+"\t");
			
		}
			System.out.println();
	}
		System.out.println("After Transpose of Matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{System.out.print(a[j][i]+"\t");
		}
			System.out.println();
	}

	}
}
