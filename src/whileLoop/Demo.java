package whileLoop;

public class Demo {

	public static void main(String[] args) {
		//While
		//initialization
		
//		int a = 1;
//		while(a<=5){
//			System.out.println("While loop");
//			a++;
//		}
//		System.out.println("While loop exit");
		
		int a = 1;
		while (a<=10) {
			if(a==5) {
//				a++;
//				continue;  // 5 value miss
				break;     //to stop op - 1234
			}
			System.out.println(a);
			a++;
		}

	}

}
