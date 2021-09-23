package java_basics;

import java.util.*;

public class JavaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[] = {10,4,5,6,8,9};
		
		Integer b[] = {3,4,5,6,7};
		
		Character c[]= {'A','B'};
		
		char ch[] = {'p','q'};
		
		//convert array a To arrayList
		
		ArrayList<Integer> li = new ArrayList<Integer>(Arrays.asList(a));
		
		li.add(7);
		
		System.out.println(li);
		
		
		//binary search
		System.out.println(Arrays.binarySearch(a, 5));
		
		
		//binary search variation
		System.out.println(Arrays.binarySearch(a,1,3,5));
		
		//compare arrays
		System.out.println(Arrays.compare(a, b));
		
		
		//Array To String
		 System.out.println(Arrays.toString(c));
		 
		 System.out.println("Array To String");
		 
		 String str = String.valueOf(ch);
		 System.out.println(str);
		 
		 //Arrays Sorting
		 Arrays.sort(a);
		 
		 System.out.println(a[0]);
		
		
		
		

	}

}
