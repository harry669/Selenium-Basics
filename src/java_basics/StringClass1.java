package java_basics;

import java.util.*;

public class StringClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s=new StringBuffer("Welcome Here");
		//string append
		s.append(" Brother");
		System.out.println(s);
		//string reverse
		//s.reverse();
	    System.out.println(s);
	  //string replace
	     s.replace(0, 4, " ");
	  	 System.out.println(s);		
	  	//string delete
		s.delete(0, 4);
		System.out.println(s);	
		//convert stringBuffer To String
		String str= s.toString();
	    System.out.println(str);	
	    
	    
	    //String Tokenization
	    StringTokenizer st = new StringTokenizer(str);
	    
	    while(st.hasMoreTokens())
	    {
	    	 System.out.println(st.nextToken());
	    }
	    
	    //Count Tokens in String Tokenizer class
	     System.out.println(st.countTokens());
	    
	}

}
