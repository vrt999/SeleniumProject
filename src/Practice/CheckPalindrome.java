package Practice;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		int n = 12231;		
		int x = n%2==0 ? n/2 : n/2+1;
		
		StringBuffer sb = new StringBuffer(Integer.toString(n));
		sb.reverse();
		
		int y = Integer.parseInt(new String(sb));
		
		System.out.println("The output: " + y);
		
		if(n==y)
		System.out.println(n + " is a palindrome");
		else
		System.out.println(n + " is not a palindrome");
			
		
	}

}
