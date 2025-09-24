package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//16-9-25
public class TextFileWriter {

	public static void main(String[] args) {
		
		
		//HomeWork
		//Create an entity class Student - > id, firstName, lastName, PhoneNo, city
		//Take ip for this values using scanner
		//Store this data in text file named as -> Studentdetails.txt
		//format should be -> id: fName : lName : phoneNumber: city
		//eg -> 1 : abc : xyz : 12346789 : Pune
		//Every student should be on new line
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter your name : ");
		String name = sc.next();
		
		System.out.println("Please Enter year of birth");
		int year = sc.nextInt();
		
		String username =name + year;
		System.out.println(username);
		
		//We want to store this username in a text file
		//we need to specify location of file creation
		//text file creation will be taken care by java
		//Writing in text file -> Java
		
		
		//1.directory path
		String directoryPath = "C:\\Users\\Lenovo\\Music\\FileHandling";
		//Specify file name
		String fileName = "username.txt";
		
		
		//C:\Users\Lenovo\Music\FileHandling
		File file = new File(directoryPath +"\\ "+fileName);
		
		//we should create a file if it is not there
		try {
		
			//creation of file
			if(file.createNewFile()) {
				System.out.println("File Created");
			
		}
		else {
			System.out.println("File already exist");
		}
			
			//Write into file -> insert username in file
			
			//true is added for append mode activated
			FileWriter writer = new FileWriter(file, true);
			writer.write(" * " +username + System.lineSeparator());
			writer.close();
			System.out.println("username written in file : " + username);
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}

}
