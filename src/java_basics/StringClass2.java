package java_basics;

import java.util.*;
public class StringClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Trying HashMap
		 HashMap<Integer,String> map = new HashMap<Integer,String>();
		 map.put(1,"test1");
		 map.put(2, "test2");
		 
		 
		    //clear
		   //map.clear();
		   System.out.println(map);
		   
		   //contains key
		   System.out.println(map.containsKey(2));
		   
		   //contains value
		   System.out.println(map.containsValue("test2"));
		   
		   //check for empty hashmap
		   System.out.println(map.isEmpty());
		   
		   
		   //remove operation in Hash Map
		   map.remove(2);
		   System.out.println(map);
		   
		   //replace in HashMap
		   map.replace(1, "test");
		   System.out.println(map);
		   
		   
		   
		 
		 
		 

	}

}
