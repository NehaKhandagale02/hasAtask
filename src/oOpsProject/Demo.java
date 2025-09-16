package oOpsProject;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
//		Calculator c = new CalAddition();
//		c.addition(10, 20);
		
		CalAddition CA = new CalAddition();
		//CA.addition(10, 20);
//		System.out.println(CA.addition(10, 20,30));
//		
//		//CA.substraction(40, 20);
//		System.out.println(CA.substraction(40, 10));
//		
//		System.out.println(CA.multiplication(10, 15));
//		
//		System.out.println(CA.division(50, 5));
//		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculator");
		System.out.println("================");
		System.out.println("1. Addition");
		System.out.println("2. Susbstraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Choose Option:");
		
		int Choice = sc.nextInt();       // read users choice - 1,2,3,4
		
		System.out.println("How many numbers do you want to Enter?");
		
		int n = sc.nextInt();            // stores that no in var n, when we enter 5 then n = 5
		
		
		int[] numbers = new int[n];      // creates array of integers with size n & store all nums by user , if n = 5 then array of size 5 numbers[0] upto 4
		
		System.out.println("Enter numbers");
		
		for(int i =0 ; i<n; i++) {
			numbers[i] = sc.nextInt();   // fills the array with user-entered numbers.  if we enter 10 , i =0 numbers[0] = 10
		}
		
		int result = 0;                  // declare a variable result initialize with 0
		
		
		switch (Choice) {
		  case 1:
			  result = CA.addition(numbers);
			  System.out.println("Addition : " + result);
			  break;
			  
		  case 2:
			  result = CA.substraction(numbers);
			  System.out.println("Substraction : " + result);
			  break;
			  
		  case 3:
			  result = CA.multiplication(numbers);
			  System.out.println("Multiplication : " + result);
			  break;
			  
		  case 4:
			  result = CA.division(numbers);
			  System.out.println("Division : " + result);
			  break;
			  
			 default:
				 System.out.println("Invalid Choice!");
			  
		}

	}

}
