package Practice;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringsPractice {

	public static void main(String[] args) {
		/*String s = "Geeks for Geeks";		
		boolean b = s.contains("for");		
		System.out.println("Is the string present: " + b);
		String lower = s.toLowerCase();
		System.out.println("The lower String: " + lower);
		char c = s.charAt(0);
		System.out.println("The character at 1st position: " + c);
		String upper = s.toUpperCase();
		System.out.println("The upper case: " + upper);
		String s1 = s.concat(" Java");
		System.out.println("The concatenated string: " + s1);
		int res1 = s1.compareTo(s);//gives the count of chars difference and - ve if s1 is smaller than s
		int res2 = s.compareTo(s1);
		System.out.println("The s1.compareTo(s): " + res1);
		System.out.println("The s.compareTo(s1): " + res2);
		String temp = s.substring(s.indexOf("Geeks")+5); //indexOf returns -1 when the string isnot found
		System.out.println("The substring values: " + temp);
		int e = s.indexOf("Geeks",2);
		int f = s.lastIndexOf("Geeks",2);
		
		//Below code is to verify the count of s2 in ss
		String ss = s;
		String s2 = "Geeks";
		int count = 0;
		System.out.println("The index of Geeks: " + s.indexOf(s2));
		while(ss.indexOf(s2) >= 0) {
			count++;
			ss = ss.substring(ss.indexOf(s2)+s2.length());	
			System.out.println("The substring in the loop: " + ss);
		}
		System.out.println("Count of " + s2 +  ": " + count);
		
		//String replace
		String s3 = s.replace('e','w');
		System.out.println("The string after char replace: " + s3);
		String s4 = s.replace("Geeks", "Taj");
		System.out.println("The string after replace: " + s4);
		String s5 = s.replaceFirst("Geeks", "Raj");
		System.out.println("The string after first replace: " + s5);
		
		System.out.println("The code point at 0: " + s.codePointAt(0));//returns the ascii values of the index
		
		//code to print ascii values of the string
		byte[] ascii = "Java".getBytes(StandardCharsets.US_ASCII);
		String asciiString = Arrays.toString(ascii);
		System.out.println(asciiString); // print [74, 97, 118, 97]
*/	
		StringsPractice sp = new StringsPractice();
		sp.removeSpaces();
	
	}
	
	public void removeSpaces() {
		String s = "Geeks for   Geeks";
		String s2 = s.replaceAll ("\\s+", " ").trim();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(s," ");
		
		while(st.hasMoreTokens()) {
			sb = sb.append(st.nextToken() + " ");
		}
		
		System.out.println(s2);		
		System.out.println(sb);
	}

	}

