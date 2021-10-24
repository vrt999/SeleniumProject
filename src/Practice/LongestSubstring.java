package Practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	/*public static void main(String[] args) {
		String in = "DebugPractice";
		
		String longString =String.valueOf(in.charAt(0));
		String temp = "";
		
		for(int k=0;k<2;k++) {
			if(temp.length()>longString.length()) {
				longString = temp;		
				System.out.println("The if loop longest String: " + longString);
				}
		for(int i=k;i<in.length()-1;i++) {// l = 5 i = 0 1 2 3 given
			temp = "";
			int j= i+1;
			if(in.charAt(k)!=in.charAt(i+1)) {
				temp = in.substring(k,i+2);
				System.out.println("The temp value in loop " + i + ": " + temp);
			}
			else {
				longString = in.substring(k,i+1);
			System.out.println("The long string in loop " + i + ": " + longString);}
		}}
		
		System.out.println("The over all longest String: " + longString);
		

	}*/
	
	private Set<String> stringSet = new HashSet<String>();
	private int lstringSet = 0;

	public Set<String> findStr(String input) {

		// Reset instance data.
		stringSet.clear();
		lstringSet = 0;

		// Set a boolean flag on each char's ASCII value.
		boolean[] flag = new boolean[256];
		int j = 0;
		char[] inputCharArr = input.toCharArray();
		for (int i = 0; i < inputCharArr.length; i++) {
			char c = inputCharArr[i];
			if (flag[c]) {
				extractSubString(inputCharArr, j, i);
				for (int k = j; k < i; k++) {
					if (inputCharArr[k] == c) {
						j = k + 1;
						break;
					}
					flag[inputCharArr[k]] = false;
				}
			} else {
				flag[c] = true;
			}
		}
		extractSubString(inputCharArr, j, inputCharArr.length);
		return stringSet;
	}

	private String extractSubString(char[] inputArr, int start, int end) {

		StringBuilder sb = new StringBuilder();
		for (int i = start; i < end; i++) {
			sb.append(inputArr[i]);
		}
		String subStr = sb.toString();
		if (subStr.length() > lstringSet) {
			lstringSet = subStr.length();
			stringSet.clear();
			stringSet.add(subStr);
		} else if (subStr.length() == lstringSet) {
			stringSet.add(subStr);
		}

		return sb.toString();
	}

	public static void main(String a[]) {

		LongestSubstring substr = new LongestSubstring();

		System.out
				.println("Actual Strings ------------ | ---- Longest Non-Repeated Strings");
		System.out.println("Software_Programmer"
				+ "         |         " + substr.findStr("Software_Programmer"));
		System.out.println("Software_Developer_In_Test"
				+  "  |         " + substr.findStr("Software_Developer_In_Test"));
		System.out.println("developers_write_unit_tests"
				+  " |         " + substr.findStr("developers_write_unit_tests"));
		System.out.println("javajavbasp.net"
				+  "             |         " + substr.findStr("javajavbasp.net"));
	}

}
