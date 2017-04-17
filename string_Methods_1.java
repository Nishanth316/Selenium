
public class string_Methods_1 {

	public static void main(String[] args) {
		String str = "This is the string";
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "Welcome";
		String str5= "  spaces  ";
		String str6 ="hello";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.concat(" This is the opened string"));
		System.out.println(str.contains("the"));
		System.out.println(str.startsWith("This"));
		System.out.println(str.endsWith("string"));
		System.out.println(str1.equals(str2));
		System.out.println(str.indexOf('h'));
		System.out.println(str.isEmpty());
		System.out.println(str5.trim());
		System.out.println(str6.replace('e', 'a'));
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 10));
		
		char[] charArray = str.toCharArray();
		for (int i=0; i<charArray.length; i++)
		
		System.out.println("INDEX" +i +"is:" +charArray[i]);
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase() );
		
		
				

	}

}
