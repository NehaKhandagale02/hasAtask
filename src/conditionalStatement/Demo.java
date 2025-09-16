package conditionalStatement;

//public class Demo {
//   public static void main(String[] args) {
//	 int a = 22;
//	 
//	 if(a%2==0) {
//		 System.out.println("It is even no");
//	 }
//	 else {
//		 System.out.println("It is odd no");
//	 }
//}
//}


//Nested if-else
public class Demo{
	public static void main(String[] args) {
		//Find if it is even or odd. if it is even then it is divisible by 10 or not.
		int a = 44;
		if(a%2 ==0) {
			System.out.println("It is even no");
	  if(a%10 ==0) {
		  System.out.println("No is divisible by 10");
	  }else {
		  System.out.println("It is not divisible by 10");
	  }
			
		}else{
			System.out.println("It is odd no");
		}
	}
}