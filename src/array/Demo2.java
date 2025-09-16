package array;

public class Demo2 {

	public static void main(String[] args) {
		
		Object[] heteroArray = {12,"ss",23.22,false};
		//System.out.println(heteroArray[3]);
		
		
		int[] rollNo = {11,12,13,14,15};
		//System.out.println(rollNo.length);
		
		for(int i = 0; i<rollNo.length; i++) {
			//System.out.println(rollNo[i]);   //i = 0, rN=11, i=1,rN=12
		}
		
		//reveres rollNo
		//rollNO.length = 5 hence length-1
		for(int i= rollNo.length -1 ; i>=0; i--) {
			//System.out.println(rollNo[i]);
		}
		
		// odd roll no
		
		for(int i = 0; i<rollNo.length;i+=2) {
			System.out.println(rollNo[i]);
		}
		
		// even roll no
		
		for(int i= 1; i<=rollNo.length-1; i+=2 ) {
			//System.out.println(rollNo[i]);
		}
		

	}

}
