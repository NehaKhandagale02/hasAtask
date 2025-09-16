package stringss;

public class DemoTwo {
	
	//hashcode - means memory addresses

	public static void main(String[] args) {
		
		//using literals
		//SCP - if value is same it wont repeat
		String s = "neha";
		String s1 = "neha";
		String s2 = "Irise";
		System.out.println(s.equals(s1));
		System.out.println(s == s1);
		System.out.println(s2 == s1);
		
		//using new keyword
// in heap - values will repeat for every String
		
		String a = new String("irise");
		String a1 = new String("irise");
		System.out.println(a.equals(a));
		System.out.println(a==a1);
		
		
		//using new keyword
//		String s2= new String("neha");
		
		//.equals() checks content, not memory
		//== equal method - Checks if both variables refer to the same object in memory or check memory address location
//		boolean flag = s.equals(s2);
//		System.out.println(flag);
//		System.out.println(s==s2);
		
		
//      //using literals
//		
//		String s ="abc";
//		int hashCode  = s.hashCode();
//		System.out.println(s.hashCode()) ;
//		
//		String s1 = "abc";
//		System.out.println(s1.hashCode());
//		
//		//using new keyword
//		String s2 = new String("Neha");
//		System.out.println(s2.hashCode());
//		
//		String s3 = new String("Neha");
//		System.out.println(s3.hashCode());
		}

}

// int a = 12 a stored in stack and 12 stored in Heap memory
//to stored value in SCP - using literals
//to stored value in Heap - using new keyword
