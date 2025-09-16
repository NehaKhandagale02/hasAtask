package stringss;

//public class DemoThree {
//	public static void main(String[] args) {
//		String s = "apple";  //SCP
//		String s1 = "apple";
//		String s2 = new String("apple");  //heap outside scp
//		String s3 = new String("apple");
//		
//		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(s2));
//		
//		System.out.println(s == s2);
//		System.out.println(s.equals(s2));
//	}
//
//}


//Strings are immutable in java
//public class DemoThree{
//	public static void main(String[] args) {
//		String s = "irise";
//		System.out.println(System.identityHashCode(s));  //point to lower case irise
//		
//		s= s.toUpperCase();
//		System.out.println(System.identityHashCode(s));
//		
//		s= s.toLowerCase();
//		System.out.println(System.identityHashCode(s));
//		
//		System.out.println(s);
//	}
//	
//}


public class DemoThree{
	public static void main(String[] args) {
		String s = "irise";
		String s1 = "irise";
		//s == s1 -> true
		//s.equals(s1) -> true
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
       s = s.toUpperCase();
       s = s.toLowerCase();
       System.out.println(System.identityHashCode(s));
       System.out.println(System.identityHashCode(s1));
		
	}
}