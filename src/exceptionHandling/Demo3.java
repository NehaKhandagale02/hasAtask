package exceptionHandling;

import java.security.InvalidParameterException;

//10-9-11
public class Demo3 {

	public static void main(String[] args) {
		//Invalid ParameterException
		//we want if age < 18 then we want invalidParameterException
		int age = 12;
		
		
		//In a conditional statement, try-catch does not work.
		if(age < 18) {
			throw new InvalidParameterException();
			
			//not eligible for voting
			//System.out.println("Not Eligible");
		}
		else {
			System.out.println("Can vote");
		}

	}

}
