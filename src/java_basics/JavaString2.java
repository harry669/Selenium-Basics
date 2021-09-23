package java_basics;

public class JavaString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s = "GAeksforGeeks";
		 
		 String no="12345";
		 
		 //Find code value of particular character of given string
		 int code= s.codePointAt(1);
		 System.out.println(code);
		 
		 //String contains method
		 System.out.println(s.contains("for"));
		 
		 //String Starts With Boolean Method
		 System.out.println(s.startsWith("G"));
		 
		 //String To Char Array
		 char ch[]= s.toCharArray();
		 
		 for(int i=0;i<ch.length;i++)
		 {
			 System.out.println(ch[i]);
		 }
		 
		 //String To Number Conversion
		  Integer i =Integer.parseInt(no);
		  System.out.println(i);
	}

}
