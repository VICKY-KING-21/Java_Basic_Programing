package testing;
import java.util.*;
public class Liner_search {

	static int linersearch(int arr[],int first,int last,int x) {
		if(last<first)
			return -1;
		if(arr[first]==x)
			return first;
		if(arr[last]==x)
			return last;
		return linersearch(arr, first+1, last-1, x);
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("The target value:");
	int x = sc.nextInt();
	int arr[]= {25,21,5,9,15};
	int index = linersearch(arr, 0, arr.length-1,x);
	if(index != -1)
		System.out.println("Element is present");
	else 
		System.out.println("Element not present");
	}

}
