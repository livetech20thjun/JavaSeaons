package stringprograms;

public class StringMethodsDemo2 {

	public static void main(String[] args) {
		
		String s1="Javb";
		
		String s2="Selenium Java";
		
		String s3="JavA";
		
				
		System.out.println(s2.indexOf('a'));
		
		System.out.println(s2.lastIndexOf('a'));
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s2.compareTo(s1));
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s3));
		
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(s2);
		
		System.out.println(s2.replace("Java", "Python").replace(" ", ""));
		System.out.println(s2);
		
		System.out.println(s2.substring(9));
		System.out.println(s2.substring(9,11));
		
		
		
		
		

	}

}
