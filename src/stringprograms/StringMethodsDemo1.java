package stringprograms;

public class StringMethodsDemo1 {

	public static void main(String[] args) {
		
		String s1="Java";
		
		String s2="Selenium Java";
		
		String s3="java";
		
		
		System.out.println(s1.contains(s2));
		System.out.println(s2.contains(s1));
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s2.startsWith("Selenium"));
		
		System.out.println(s2.endsWith("Java"));

	}

}
