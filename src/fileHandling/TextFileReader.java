package fileHandling;
//17-9-25

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TextFileReader {
	
	//Homework -> Student details file
	//read data from Studentdetails txt and print it as a objec
	//convert every line from txt to Student object
	//then print student object using toString or getter

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\Lenovo\\Music\\FileReader\\Test.txt";
		
		
      try {
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String line;
		
		//to read Apple Mango pomogranets in hotizontally
		
		while((line = reader.readLine())!= null){
			System.out.println(line);
			
			}
		
		

	}catch (IOException e) {
		e.printStackTrace();
	}

}
}
