package RegExp;

import java.util.regex.Pattern;

public class RegExSample {

	public static void main(String[] args) {
//		s.matches(Pattern.quote(testName)+"(_ex\\d+){0,1}");//_ex\d
//		String newtestName = testName.concat(String.format("_ex%04d", exampleNums.size()+1));
//		
//		String testName = CucumberNameResolver.prepareTestName("%s(%s)",pickle,feature);
//		String testName1 = CucumberNameResolver.prepareTestName("%s_%s",pickle,feature);
//		s.macthes(Pattern.quote(testName)+"(\\[EX\\d+\\]){0,1}");
//		testName.concat(String.format("[EX%04d]", exampleNums.size()+1));
		
		System.out.println("The formatted String: " + String.format("[EX%04d]", 99999));
		System.out.println("The formatted String: " + String.format("_ex%04d", 9));
		System.out.println("The formatted String: " + String.format("%s+%s", "Example",9));

	}

}
