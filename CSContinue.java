/* Program to show the working of continue statement
 * Submitted By:Sameer Singh
 * CSE-D
 * 1703310170
 */
public class CSContinue {

	public static void main(String[] args) {
		 
	      for (int i = 1; i <= 10; ++i) {      
	         if (i > 4 && i < 9) {
	            continue;
	         }      
	         System.out.println(i);
	      }   
	}

}
