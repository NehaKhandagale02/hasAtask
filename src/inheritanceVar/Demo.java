package inheritanceVar;

public class Demo {

	public static void main(String[] args) {
		//variables
		
		Tiger t = new Tiger();
		System.out.println(t.a);
		System.out.println(t.b);
		
		
		Animal aa = new Tiger();
		System.out.println(aa.d);
		System.out.println(aa.a);
	}

}
