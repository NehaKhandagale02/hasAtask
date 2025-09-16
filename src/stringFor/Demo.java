package stringFor;

//public class Demo {
//
//	public static void main(String[] args) {
//		String day = "Monday";
//		//System.out.println(day);
//		int length = day.length();
//		//System.out.println(length);
//		
//		for(int i = 0; i<day.length(); i++) {
//			System.out.println(day.charAt(i));
//		}
//
//	}
//
//}






public class Demo{
	public static void main(String[] args) {
		String day = "Monday";
		int length = day.length();
		System.out.println(length);
		
		for(int i = 0; i < day.length(); i++) {
			if(i%2==0) {
				System.out.println(day.charAt(i));
			}
		}
	}
}