package Practice;

import java.util.Random;

public class RemoveSpaces {
/*    public static void main(String args[]){
    	
        String input = "Try    to    remove  extra   spaces.";
        StringTokenizer substr = new StringTokenizer(input, " ");
        StringBuffer sb = new StringBuffer();
        
        while(substr.hasMoreElements()){
        	String s = (String) substr.nextElement();
        	System.out.println("Element is" + "\"" + s + "\"");
            sb.append(s).append(" ");
        }
        
        System.out.println("Actual string: " + input);
        System.out.println("Processed string: " + sb.toString().trim());
    }*/
	
/*    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        str = in.nextLine();
        String[] token = str.split("");    //used split method to print in reverse order
        System.out.println("The split array: " + Arrays.toString(token));
        for(int i=token.length-1; i>=0; i--)
        {
            System.out.print(token[i] + "");
        }
         
    }*/
	
    public static void main(String[] args)
    {
        String str1 = "Saket Saurav        is a QualityAna    list";  
        //1. Using replaceAll() Method  
        String str2 = str1.replaceAll("\\s", "");  
        System.out.println(str2);  
           }
    
/*    &lt; stands for the less-than sign ( < )
    &gt; stands for the greater-than sign ( > )
    &le; stands for the less-than or equals sign ( ≤ )
    &ge; stands for the greater-than or equals sign ( ≥ )*/
//    using above abpcondition in while - while (num &gt; 0)
}
