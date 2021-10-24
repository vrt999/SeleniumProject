package Practice;

import java.util.Arrays;
import java.util.Scanner;

/*public class SplitString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the input String: ");
		
		String input = s.nextLine();
		
		String out[] = input.split("\\[");
		
		System.out.println("The output Array: " + Arrays.toString(out));
		s.close();

	}

}*/

class AA
{
    String s = "Class A";
}
 
class BB extends AA
{
    String s = "Class B";
 
    {
        System.out.println(super.s);
    }
}
 
class CC extends BB
{
    String s = "Class C";
 
    {
        System.out.println(super.s);
    }
}
 
public class SplitString
{
    public static void main(String[] args)
    {
        CC c = new CC();
 
        System.out.println(c.s);
    }
}
