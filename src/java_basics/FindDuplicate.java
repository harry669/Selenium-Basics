package java_basics;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean alpha[] = new boolean[26];
		
		//Find Duplicate
		String s = "geeigk";
		
		System.out.println("Repeated Characters");
		
		for(int i=0;i<s.length();i++)
		{
		    char ch= s.charAt(i);
		    
		    //character not were present so it is not repeted
		    if(alpha[ch-'a'] == false)
		    {
		    	alpha[ch - 'a'] = true;
		    }
		    else 
		    {
		    	System.out.println(ch);
		    }
		}
	}

}
