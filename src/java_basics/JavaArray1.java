package java_basics;

import java.util.*;

public class JavaArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Integer arr[]= {5,4,3};
		 
		 Integer arr1[]= {3,4,5};
		 
		 
		 //convert array to ArrayList
		  ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(arr));
		  System.out.println(list);
		  
		  
		  //searching in array
		  System.out.println(Arrays.binarySearch(arr,0,2, 5));
		  
		  //compare two array
		  System.out.println(Arrays.compare(arr, arr1));
		  
		  
		  //copy of array elements from one array to another array
		  Integer arr2[]= Arrays.copyOfRange(arr, 0, 3);
		  System.out.println(arr2);
		  
		  
		  //boolean array equals or not
		  System.out.println(Arrays.equals(arr, arr1));
		  
		  
		  //Arrays Mismatch MEthod
		  System.out.println(Arrays.mismatch(arr, arr1));
		  
		  //Array Sort Method
		  //Arrays.sort(arr);
		  System.out.println(arr[0]);
		  
		  
		  //Array Sort For Particular range
		  Arrays.sort(arr,1,3);
		  System.out.println(arr[2]);
		  
		  
		  
		  
		  
		  

	}

}
