package java_basics;

import java.util.*;
public class JavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  //ArrayList Demo
		
		ArrayList<String> li=new ArrayList<String>();
		
		ArrayList<Character> ch=new ArrayList<Character>();
		
		li.add("ele1");
		li.add("ele1");
		
		ch.add('A');
		ch.add('B');
		
		//Find frequency of ele1 in arrayList
		
		System.out.println(Collections.frequency(li, "ele1"));
		
		//ToArray Method
		String[] liArray= new String[li.size()];
		
		
		
		liArray= li.toArray(liArray);
		
		System.out.println("ArrayList To Array");
		for(String i:liArray)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		System.out.println("Remove Elements From ArrayList");
		li.remove(0);
		
		for(int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i));
		}
		
		
		
		
		
		
		Stack<Integer> st=new Stack<Integer>();
		
		st.push(1);
		st.push(3);
		st.push(3);
		st.push(4);
		st.push(5);
		
		//find peek element of stack
				System.out.println(st.peek());
				
		//search particular element of stack
				System.out.println(st.search(3));
				
		
		       //Find if Stack is Empty Or Not
				System.out.println(st.isEmpty());
				
				//Find if element contain in particular collection
				System.out.println(st.contains(5));
				
				//Clear all Elements of Collection
				
				li.clear();
				
					System.out.println(li.size());
				
		
				
		System.out.println("Stack Loop");
		for(int i=0;i<5;i++)
		{
			Integer y= (Integer)st.pop();
			System.out.println(y);
		}
		
		//Implement HashSet IT Stored element in Hash Table
		
		HashSet<Integer> set1=new HashSet<Integer>();
		
		set1.add(1);
		set1.add(1);
		
		System.out.println("HashSet Elements");
		System.out.println(set1.size());
		for(Integer i:set1)
		{
			System.out.println(i);
		}
		
		//Implement HashMap It Stored Key Value Pair
		
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		
		 map1.put(1,"Mango");
		 map1.put(2,"Mang");
		 
		 map1.remove(2);
		 
		  map1.forEach((k,v) -> System.out.println("Key = "
	                + k + ", Value = " + v));
		

	}

}
