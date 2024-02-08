package testing;

import java.util.Arrays;
import java.util.Comparator;


/*public class Comparatordemo implements Comparator { // create new class and copy the code and paste it //

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		if(s1.length()>s2.length()) { //condition 
			return 1;
		}else if(s1.length()<s2.length()) {
			return -1;
		}else {
			
			return 0;
		
		}
	}

}*/
public class Array_sort {

	public static void main(String[] args) {
		
		String [] names = {"car", "apple","flip","mouse","error","hi"};  // basic sort 
		System.out.println("before sort:");
		for(String s:names) {
			System.out.println(s);
		}
		System.out.println();
		
		Arrays.sort(names);
		System.out.println("after sort:");
		for(String s:names) {
			System.out.println(s);
		}
		
		Comparator comp = new Comparatordemo();// comparator type import in this class
		
		Arrays.sort(names,comp);
		
		System.out.println();
		System.out.println("sorted array:");
		for(String s:names) {
			System.out.println(s);
		}
		
	}

}


/*	String [] names = {"car", "apple","flip","mouse","error"};  // basic sort 
		System.out.println("before sort:");
		for(String s:names) {
			System.out.println(s);
		}
		Arrays.sort(names);
		System.out.println("after sort:");
		for(String s:names) {
			System.out.println(s);
		}*/