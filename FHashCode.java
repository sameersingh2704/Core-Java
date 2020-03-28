/* Program to find hashcode of strings
 * Submitted By:Sameer Singh
 * CSE-D
 * 1703310170
 */
public class FHashCode {

	public static void main(String[] args) {
		String S1="Hello";
		String S2="World";
		System.out.println(S1.hashCode());
		S1=S1+S2;
		System.out.print(S1.hashCode());

	}

}
