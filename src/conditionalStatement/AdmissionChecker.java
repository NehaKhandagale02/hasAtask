package conditionalStatement;

//Nested if else
public class AdmissionChecker {
   public static void main(String[] args) {
	int maths = 1;
	int science = 85;
	int english = 51;
	int age = 19;
	
	int totalMarks = maths + science + english;
	//1. age>17
	//2. every sub marks>50
	//3. total marks>160
	
	//  && operator -This line checks multiple conditions together.
	if(age>17) {
		if(maths>50 && science>50 && english>50 ) {
			if(totalMarks >=160) {
			 System.out.println("Eligible for admission");	
			}
			else {
				System.out.println("Not eligible due to total marks <=160");
			}
			}
		
		else {
			//task - print which subject has marks less than 50
			System.out.println("Not eligible bcz one of sub has marks less than 50");
			
			if(maths < 50) {
				System.out.println("maths has less than 50 marks");
			}
			if(science < 50) {
				System.out.println("Science has less than 50 marks");
			}
			if(english < 50) {
				System.out.println("english has less than 50 marks");
			}
		}
	}
	else {
		System.out.println("Not eligible for admission for age less than 17");
	}
}
}
