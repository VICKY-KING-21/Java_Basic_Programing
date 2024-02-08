package testing;
import java.util.*;
public class Binary_search {
	int Binary_search(int arr[],int first,int last,int x) {
		while(first <=last) {
			int mid = (first+last)/2;
			
			if(arr[mid]==x) {
				return mid;
			}else if (arr[mid]>x) {
				last = mid-1;
			}else {
				first=mid+1;
			}
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Binary_search obj =new Binary_search();
		int arr[]= {15, 20, 21, 50,8};
		int n =arr.length;
		System.out.print("The target value:");
		int x= sc.nextInt();
		int result = obj.Binary_search(arr, 0, n-1, x);
		if(result== -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index "+result);
	}

}
