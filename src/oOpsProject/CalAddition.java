package oOpsProject;

//child
public class CalAddition extends Calculator{

	
	//overriding - runtime polymorphism
	@Override
	public int addition(int a, int b) {
		System.out.println("addition");
		return a + b;
	}
	
	
	
	@Override
	public int substraction(int a, int b) {
		System.out.println("substraction");
		return a - b;
		
		}
	
	
     @Override
	public int multiplication(int a, int b) {
		System.out.println("Multiplication");
		return a * b;
	}



	@Override
	public int division(int a, int b) {
		System.out.println("Division");
		return a / b;
	}



//	//overloading - compile time polymorphism
//	public int addition(int a, int b, int c) {
//		System.out.println("Addition");
//		return a + b + c;
//	}
//	
//	public int substraction(int a, int b, int c) {
//		System.out.println("Substraction");
//		return a - b - c;
//	}
//	
//	public int multiplication(int a, int b, int c) {
//		System.out.println("Multiplication");
//		return a * b * c;
//	}
//	
//	public int division(int a, int b, int c) {
//		System.out.println("Division");
//		return a / b / c;
//	}
	
	
	
	public int addition(int... nums) {
		int Sum = 0;
		for(int i = 0; i< nums.length; i++) { // we can use also for(int n : nums)
			Sum = Sum + nums[i];              //[10,20,30 - 0+10=20, 10+20=30
		}
		return Sum;
	}
	
	public int substraction(int... nums) {      //(int... nums) - Variable Arguments , nums works like an array = [10,20}
		int result = nums[0];             //Start with the first element (nums[0]), because subtraction needs a base
		for(int i = 1; i< nums.length; i++) {
			result= result - nums[i];
		}
		return result;
	}
	
	public int multiplication(int... nums) {
		int result = 1;           // start with 1 , If we start with 0, the result will always be 0
		for(int i = 0; i< nums.length; i++) {
			result = result * nums[i];         // 1*5 =5, 5*10=50
		}
		return result;
	}
	
	public int division(int... nums) {
		int result = nums[0];           // start with first num
		for(int i =1 ; i< nums.length; i++) {
			result = result / nums[i];
		}
		return result;
	}

}
