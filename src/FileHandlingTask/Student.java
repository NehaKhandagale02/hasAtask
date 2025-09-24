package FileHandlingTask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student id");
		int id = sc.nextInt();
		System.out.println("Enter student fName");
		String fName = sc.next();
		System.out.println("Enter student lName");
		String lName = sc.next();
		System.out.println("Enter phoneNo");
		String phoneNo = sc.next();
		System.out.println("Enter city");
		String city = sc.next();
		
		
		//Format -  id : fName : lName : phoneNumber : city
		String studentDetails = id + " : " + fName + " : " + lName + " : " + phoneNo + " : " + city;
		
		//directory path
		String directoryPath = "C:\\Users\\Lenovo\\Music\\FileHandling";
		//File name
		String fileName = "StudentDetails.txt";
		
		//File object
		File file = new File(directoryPath +"\\ "+fileName);
		
		try {
			//create file if not exist
			if(file.createNewFile()) {
				System.out.println("File Created");
			}
			else {
				System.out.println("File already exists");
			}
			
			FileWriter writer = new FileWriter(file, true);
			writer.write(studentDetails + System.lineSeparator());
			writer.close();
			
			System.out.println("Student details written in file successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		 finally {
			 sc.close();
		 }
		
		
		
	}

}
