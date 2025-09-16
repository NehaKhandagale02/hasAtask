package stringFor;

public class Demo1 {

	public static void main(String[] args) {
		String day = "Monday";
		int length = day.length();
		System.out.println(length);
		
		for(int i = 0; i < day.length(); i++) {
			if(day.charAt(i)!= 'a' && day.charAt(i) !='0') {
				System.out.println(day.charAt(i));
			}
		}

	}

}
