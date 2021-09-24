package java_basics;

import java.util.*;

public class JavaInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   //multple ways to input in java
		   
		Scanner s =new Scanner(System.in);
		
		//String Input
		String input1= s.nextLine();
		System.out.println(input1);
		
		System.out.println("-------------------------------------------");
		
		 int input2= s.nextInt();
		 System.out.println(input2);
			
	     System.out.println("-------------------------------------------");
	     
	     char input3= s.next().charAt(0);
	     System.out.println(input3);
	}

}
