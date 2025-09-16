package stringss;

public class Demo {
	public static void main(String[] args) {
		
		String s = "IrISE institute";
		
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		char c = s.charAt(1);
		System.out.println(c);
		
		System.out.println(s.concat("Pune"));
		
		System.out.println(s.endsWith("e"));
		System.out.println(s.startsWith("Iri"));
		int i = s.indexOf("E");
		System.out.println(i);
		
		System.out.println(s.contains("institute"));
		
		System.out.println(s.isEmpty());
	}

}

//s.length() - Returns total no of characters in string. - o/p - 15
//
// s.toLowerCase() - Converts all characters in the string to lowercase.
//
// s.toUpperCase() - Converts all characters in the string to uppercase.
//
//  s.charAt(1) - Returns the character at index 1 (index starts from 0). o/p - r
//
//s.concat("Pune") - Concatenates the string "Pune" at the end of s. O/p - "IrISE institutePune"
//
// s.endsWith("e") - Checks if the string ends with the character "e". O/p: true
//
//s.startsWith - Checks if the string starts with "Iri" (case-sensitive).
//Output- false (Because the original string starts with "IrI")
//
// s.indexOf("E") - Returns the index of the first occurrence of character "E".
//Output: 3 (The first capital E is at index 3)
//
//s.contains- Checks if "institute" is a part of the string s. o/p - true
//
//s.isEmpty() - Checks if the string is empty. O/p: false (Because s contains text)
//
//
//
//
