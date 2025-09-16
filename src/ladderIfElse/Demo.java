package ladderIfElse;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		//input from scanner and use else if condition
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no bet 1 to 7");
		int input = sc.nextInt();
		
		//int input = 3;
		
		if(input == 1) {
			System.out.println("Monday");
		}else if(input == 2) {
			System.out.println("Tuesday");
		}else if(input == 3) {
			System.out.println("Wednesday");
		}else if(input == 4) {
			System.out.println("Thursday");
		}else if(input == 5) {
			System.out.println("Friday");
		}else if(input == 6) {
			System.out.println("Satuday");
		}else if(input == 7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Invalid input");
		}
	}

}
