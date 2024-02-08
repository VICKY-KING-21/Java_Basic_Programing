package testing;

public class Seection_sort {
	public static void selectionsort(int []arr) {
		
		for(int i=0;i<arr.length-1;i++) 
		{
			int index =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]< arr[index]) {
					index=j;
				}
				}
					int samller = arr[index];
					arr[index]=arr[i];
					arr[i]=samller;
		}
	} 
	
	public static void main(String[] args) {
		  int [] arr1 ={3,60,35,2,45,320,5}; 
		   System.out.println("befor sorted array");
		   for(int i:arr1) {
			   System.out.print(i+" ");
		   }
		   System.out.println();
		   
		   selectionsort(arr1);
		   System.out.println("after sorted array");
		   for(int i:arr1) {
			   System.out.print(i+" ");
		   }
	}

}
