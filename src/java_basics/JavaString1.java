package java_basics;

import java.util.*;

public class JavaString1 {
	
	public void FindPalindrome(ArrayList<String> li)
	{
        //Find Length of longest string within arraylist li
	    
		String maxstring="";
		int maxlen=1;
		for(String s:li)
		{
			int len=s.length();
			if(len>=maxlen)
			{
                maxlen=len;	
                maxstring=s;
			}
		}
		
		 //String with Max length
		System.out.println(maxstring);
		  
		
	} 
	
	public  void CheckPalindrome(String str,ArrayList<String> li)
	{
		String Original= str;
		StringBuilder  s=new StringBuilder();
		s.append(Original);
		s.reverse();
		String New= s.toString();
		 
		if(New.compareTo(Original) == 0)
		{
			li.add(Original);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pratice Java String classes
		
		String str1= "Java Exercises!";
		int index=3;
		
		JavaString1 obj=new JavaString1();
		
		char ch1= str1.charAt(index);
		
		StringBuffer s=new StringBuffer("example.com");
		
		ArrayList<String> list=new ArrayList<String>();
		//System.out.println(ch1);
		
		
		int unicode= str1.codePointAt(index);
		//System.out.println(unicode);
		
		String str2= "This is Exercise 1";
		String str3= "This is Exercise 1";
		
		//compare two strings
		System.out.println(str2.compareTo(str3));
		
		String str4="PHP Exercises and Python Exercises";
		System.out.println(str4.contains("and"));
		
		//conntent sequence
		
		String str5="example.com";
		String str6="Example.com";
		CharSequence cs = "example.com";
		System.out.println(str5.contentEquals(s));
		
		//create unique identifier
		System.out.println(str5.hashCode());
		
		String str7="The quick brown fox jumps over the lazy dog.";
		String str8= str7.replace("fox", "cat");
		System.out.println(str8);
		
		//generate all substring of strings
		System.out.println("All Substring Of String");
		String str9="thequickbrownfoxxofnworbquickthe";
		//generate substrings
		int len= str9.length();
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<=len;j++)
			{
				String sub= str9.substring(i, j);
				obj.CheckPalindrome(sub,list);
			}
		}
		
		obj.FindPalindrome(list);
		
	}

}
