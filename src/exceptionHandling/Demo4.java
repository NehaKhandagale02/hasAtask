package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo4 {
	
	public static void main(String[] args) {
		 
		//int a = 12/0;
		Demo4 d = new Demo4();
		try {
		d.div();
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("End");
	}
	
	public void div() throws ArithmeticException {
		int a = 12/0;
	}
	
	
	
	
}

	
//	//Compile time using throw
//
//	public static void main(String[] args) {
//		 
//		Demo4 d = new Demo4();
//		
//		try {
//			d.anything();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//
//	}
//	
//	public void anything() throws FileNotFoundException{
//		Demo4 d = new Demo4();
//		d.something();
//	}
//	
//	public void something() throws FileNotFoundException{
//		FileReader reader = new FileReader("abc.txt");
//	}
//
//}
