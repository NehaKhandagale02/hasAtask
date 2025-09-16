package scanner;

import java.util.Scanner; //"I want to use Scanner to take input from the user."

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("Value of a "  +a);
		
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		System.out.println("Value of b " +b);
		
		
		Calculator c = new Calculator();
		c.printSum(a, b);
	}
	public void printSum(int a, int b) {
		int sum = a+b;
		System.out.println("Addition is : " +sum);
	}

}

//In above code user define value.
		//System.out.println("Enter value of a : ");  - Input from console
//Scanner sc = new Scanner(System.in); - To call method in scanner class create object of scanner class
//int a = sc.nextInt(); -  call method in scanner class

//   Scanner - Used to take input from the keyboard or user.
//            But Scanner is not built-in by default. So we need to import it from a package.
//java.util is a package

//Scanner class already in JRE system library we can only create object of java class
//we cant edit scanner class this class is written by java. it have readonly access.
