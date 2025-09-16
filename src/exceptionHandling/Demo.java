package exceptionHandling;

//An exception occurs during program execution, and it stops the normal flow of the program

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

      //public class Demo{
    	  
    	  //public static void main(String[] args) {
			
    		  //compileTime Exception or checked exception
    		  
//    		  try {
//    			  FileReader reader = new FileReader("testt.txt");
//    		  } catch (FileNotFoundException e) {
//    			  e.printStackTrace();
//    		  }
    		  
    		  
    		  
  //Compiler means the program that checks your Java code and converts it into bytecode so that JVM can run it.
   //It is a compile-time (checked) exception because:

//The Java compiler checks this line:
//FileReader reader = new FileReader("testt.txt");
//
//The method FileReader(...) declares that it can throw FileNotFoundException.
//So the compiler forces you to handle it with try-catch or throws.
//If you don’t handle it, the program will not compile (error before running).
//That’s why we call it a compile-time exception (or checked exception).
//    		  
    		  
    		  
    		 
    		  
    		  

    		  
    		  




      







      
      
       //9-9-25


      public class Demo{
    	  
    	  public static void main(String[] args) {
    		  
    		  //runtime exception or unchecked exception
    		  
    		  System.out.println("Code Started");
    		  
    		  int a =12;
    		  
    		  Scanner sc = new Scanner(System.in);
    		  int value = sc.nextInt();
    		  
    		  
    		  try {
    			  int div = 12/value;
    			  //int div = 12/0;  
    			  System.out.println(div);
    		  }
    		  catch (ArithmeticException e) {
    			 e.printStackTrace(); 
    		  }
    		  finally {
    			  System.out.println("Finally Block");
    		  }
    		   
    		  //int div = 12/0;
    		  
//    		  System.out.println("Code Completed");
//    		  
//    		  int mul = 12*3;
//    		  System.out.println(mul);
//			
		}
    	  
      }


      //e - exception object in catch block.
      //printStackTrace() - is a method of Exception class.
      //it prints error details & line no where the exception is occured.



      //A runtime exception occurs only while the program is running, and the compiler does not check it before programm runs.or excecution.
	  
//    int div = 12 / value;
//	  The compiler (javac) did not give any error even though this line can fail (if value = 0).
//
//	  It allowed your program to compile successfully without asking you to handle the exception.
//   Only when you run the program and actually enter 0, the error (ArithmeticException) happens.
	  











