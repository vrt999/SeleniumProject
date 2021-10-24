package Practice;

public class StringBuilderCheck {

	public static void main(String[] args) {
		String s = "GeeksforGeeks";
		StringBuilder sb = new StringBuilder("GeeksforGeeks");
		sb.substring(5); // sb isnot changed to the output here as the return type is string
		StringBuilder sb1 = sb.delete(0,4);//These methods modify the original String builder
		String s1 = s.replace("Geeks", "six");
//		sb1.deleteCharAt(0);
		System.out.println("The new one: " + sb);
		sb.setLength(12);//spaces are added at the end if the new length > actual length
		System.out.println("The after length change: " + sb);
		sb.deleteCharAt(0);
		System.out.println("The length of the builder after delete: " + sb.length());//length decreases after the delete operation
		System.out.println("The after delete change: " + sb);
		sb.replace(0, 3, "sixer");
		System.out.println("The after replace change: " + sb);
		System.out.println("The lenth of the builder after replace: " + sb.length());
		sb.reverse();
		System.out.println("The builder after reverse: " + sb);
		sb.reverse();
		sb.insert(0, "Geeks");
		System.out.println("The builder after insert: " + sb);
		sb.trimToSize();
		
	}

}
