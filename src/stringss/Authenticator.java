package stringss;

import java.util.Scanner;

public class Authenticator {
	
	public static void main(String[] args) {
		
	//1 input from scanner - username and password in stirng
	//2 validate if password and username are correct
	//3 if yes - login successful
	//4 if no - invalid username //invalid password
		
		String u = "neha";
		String p = "Neha123";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username");
		String username = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		if(u.equals(username) && p.equals(password)) {
			System.out.println("LOngin Successful");
		}
		else {
			System.out.println("Login Failed");
			if(!u.equals(username)) {
				System.out.println("Enter valid username");
			}
			if(!p.equals(password)) {
				System.out.println("Enter valid password");
			}
		}
	}

}

//The equals() method is used to compare the actual content (characters) of two String objects.
