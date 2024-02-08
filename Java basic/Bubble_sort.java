package testing;

public class Bubble_sort {
	static void bubblesort(int arr[]) {
		int size=arr.length;
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j] > arr[j+1]) { 
					int swap =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
					}
				}
			}
		}
	public static void main(String[] args) {
	    int arr[] ={3,60,35,2,45,320,5};  
        
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        bubblesort(arr);
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

		}  
	}

