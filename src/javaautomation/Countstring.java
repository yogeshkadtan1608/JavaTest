package javaautomation;

public class Countstring {

	public static void main(String[] args) 
	
	{
		String abc = "welcome to velocity";
		
		String pqr = abc.replaceAll(" ", "");
		System.out.println("Given string count is: " + pqr.length());

	}

}
