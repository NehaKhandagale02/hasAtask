package stringss;

//public class StringExample {
//
//	public static void main(String[] args) {
//		String s = "irise";
//		String s1 = "irise";
//		
//		//String s2 = new String("irise");
//		
//		//s ==s1 -> true  - pointing to the same object in the String Pool, 
//		//s.equals(s1) -> true - compares contents o/p - true bcz same character
//		
//		
//		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(s1));
//        //System.out.println(System.identityHashCode(s2));
//        
//		s= s.toUpperCase();
//		s1 = s1.toLowerCase();
//		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(s1));
//	}
//
//}




public class StringExample{
	public static void main(String[] args) {
		
		String s = "irise";
		String s1 = "irise";
		
	System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		s= s.toUpperCase();
		s1 = s1.toUpperCase();
		
		
		System.out.println(s);
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
	}
}
