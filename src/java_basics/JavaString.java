package java_basics;

public class JavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String s="I am Here";
		  String t= "Welcome";;
		  
		  //string length
		  System.out.println(s.length());
		  
		  //find character at specific index of string
		   System.out.println(s.charAt(0));
		   
		   //find substring
		   String substr1=  s.substring(2);
		   System.out.println(substr1);
		   
		   //find substring variation
		   String substr2= s.substring(0, 2);
		   System.out.println(substr2);
		   
		   //Concatenates strings
		   String u= s + " "+ t;
		   System.out.println(u);
		   
		   //Concatenates string with different method
		   String v= s.concat(t);
		   System.out.println(v);
		   
		   //Index Of Method-Index of char or string in Given String
		   System.out.println(s.indexOf("am"));
		   
		   //Compare Two Strings
		   System.out.println(s.compareTo(t));
		   
		   //convert String To upper case  or lower case
		   System.out.println(s.toUpperCase());
		   
		   //String Replace Method
		   String replace1= s.replace('e', 'p');
		   System.out.println(replace1);
		   
		   
		   
		   
		  
		  
		  
	}

}
