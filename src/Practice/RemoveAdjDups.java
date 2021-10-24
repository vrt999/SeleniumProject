package Practice;

public class RemoveAdjDups {

	public static void main(String[] args) {
		String a = "acaaabbbacdddd";
		String s = "";
		int i = 0;
		while(i<a.length()-1) {
			int k = i;
			int c = 0;
			while(a.charAt(k)==a.charAt(i+1))	{
				c++;
				i++;
			}
			if(c>0) {
			s= s+a.charAt(i+1);
			System.out.println("S value: " + s);
			i++;}
			else {
				s= s+a.charAt(i);
				System.out.println("S value: " + s);
				i++;
				
			}
		}
		
		System.out.println("The output string is: " + s);


	}

}
