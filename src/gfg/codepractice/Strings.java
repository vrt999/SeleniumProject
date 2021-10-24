package gfg.codepractice;

import java.util.Arrays;

public class Strings {

/*	public static void main(String[] args) {
		String ss = "abcd";int n = 0;
		Strings s = new Strings();
//		System.out.println("The rotated string: " + Arrays.toString(s.rotate(ss, n)));
		s.permuteString();
	}
	
	public void wordsReverse() {
		String s1 = "I have    two legs",s2 = "";;
		
		for(int i = s1.length()-1;i>=0;i--) {
			s2 = s2+s1.charAt(i);			
		}
		
		String s3 = s2.replaceAll("\\s+", " ");
		System.out.println(s3);
		
		System.out.println("The reverse words in string: " + s2);
	}
	
	public void permuteString() {
		String a = "abcd",temp = "";
		String ss[] = {a};
			for(int i = 0;i<=ss.length-1;i++) {
//				for(int j = i;j<=ss.length-1;j++) {
			System.out.println("The rotated string: " + Arrays.toString(rotate(ss[j], j)));
			ss = rotate(ss[j], j);}
//			}
}

	private String[] rotate(String a, int i) { //abcd 0 abcd 1
		int d = 0,e=0;
		String st[] = new String[a.length()-i];
		st[d] = a;
		String b = a;
		while(e<a.length()-1-i) {			
			char c[] = new char[a.length()];
			for(int p = 0;p<i;p++)
				c[p] = b.charAt(p);
			for(int n=i;n<a.length()-1;n++)
				c[n] = b.charAt(n+1);
			c[a.length()-1] = b.charAt(i);		
			b = new String(c);
			st[++d] = b;
			e++;
		}
		
		return st;
		
	}*/
	public static String swapString(String a, int i, int j) {  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  
      
    public static void main(String[] args)  
    {  
        String str = "ABCD";  
        int len = str.length();  
        System.out.println("All the permutations of the string are:");  
        generatePermutation(str, 0, len);  
    }  
      
    //Function for generating different permutations of the string  
    public static void generatePermutation(String str, int start, int end)  
    {  
        //Prints the permutations  
        if (start == end-1)  
            System.out.print(str + " ");  
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                //Swapping the string by fixing a character  
                str = swapString(str,start,i);  
                //Recursively calling function generatePermutation() for rest of the characters   
                generatePermutation(str,start+1,end);  
                //Backtracking and swapping the characters again.  
                str = swapString(str,start,i);  
            }  
        }  
    }

}
