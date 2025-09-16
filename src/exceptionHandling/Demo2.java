package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

//10-9-25
public class Demo2 {

	public static void main(String[] args) {
		
		//part 2
		//try inside try - nested
		
		System.out.println("Enter a : ");
		
		try {
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			try {
				int div = 12/a;
				System.out.println(div);
			}
			catch (ArithmeticException e) {
				System.out.println("Please Enter non zero number");
				e.printStackTrace();
				
			}
		
		} catch(InputMismatchException e) {
			System.out.println("Enter only Integer value");
			e.printStackTrace();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");
		
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();   exception here - hence they are in try block
//		int div = 12/a;
//		System.out.println(div);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		//part 1
//		System.out.println("Enter a :");
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//		    int a = sc.nextInt();
//			int div = 12/a;
//			System.out.println(div);
//		}
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("End");
//		
//		

	}

}
