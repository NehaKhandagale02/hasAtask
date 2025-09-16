package array;

public class Demo1 {

	public static void main(String[] args) {
		
		int[] no= {12,78,96,85};
		
		System.out.println(no.length); //no.length → gives total number of elements = 4
		System.out.println(no[0]);
		System.out.println(no[1]);
		System.out.println(no[2]);
		System.out.println(no[3]);
		

		String[] arr = {"abc", "def"};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		
		double[] d= {21.d, 78.2d};
		
		System.out.println(d[0]);
		System.out.println(d[1]);
		
		
		
		boolean[] b = {true,false,true};
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		System.out.println("----------------------");
		
		System.out.println("Insertion of array int");
		
		int[] rollNo = new int[3];
		
		rollNo[0]= 10;
		rollNo[1]= 15;
		rollNo[2]= 20;
		
		System.out.println(rollNo[0]);
		System.out.println(rollNo[1]);
		System.out.println(rollNo[2]);
		
		
		System.out.println("Insertrion of double");
		
		double [] per = new double[2];
		
		per[0] = 23.24d;
		per[1] = 20.45d;
		
		System.out.println(per[0]);
		System.out.println(per[1]);
		
		
		System.out.println("Insertion of boolean");
		
		boolean [] b1 = new boolean[2];
		
		b1[0] = true;
		b1[1] = false;
		
		System.out.println(b1[0]);
		System.out.println(b1[1]);
		
		System.out.println("Insertion of String");
		
		String [] s = new String[2];
		
		s[0] = "abc";
		s[1] = "def";
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		
		
	}

}
