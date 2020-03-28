/* Program to split a string
 * Submitted By:Sameer Singh
 * CSE-D
 * 1703310170
 */
public class Split 
{
  public static void main(String[] args) 
    {
      String str = "Hello@World@Hello"; 
      String[] arrOfStr = str.split("@"); 

      for (String a : arrOfStr) 
          System.out.println(a); 
    }     
}
