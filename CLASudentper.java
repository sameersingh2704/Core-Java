/* Program to show the working of break statement
 * Submitted By:Sameer Singh
 * CSE-D
 * 1703310170
 */
public class CLASudentper {
	
	public static void main(String args[])
	{
	int i,n,x=0,y=0;
	System.out.println("enter the number of subjects");
	n=Integer.parseInt(args[0]);
	
	System.out.println("enter the marks of each subject");
	
	int a[] = new int[n];
	 for(i=1;i<=n;i++)
	{
	a[i-1]=Integer.parseInt(args[i]);
	System.out.println(a[i-1]);
	x=x+a[i-1];
	}
	System.out.println("total sum is"+x);
	y=x/n;
	System.out.println("%age is"+y);
	}
	}

