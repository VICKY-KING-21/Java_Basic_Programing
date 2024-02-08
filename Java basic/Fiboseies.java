package testing;

public class Fiboseies {

	public static void main(String[] args) {

		int max =5 , first=0 ,next =1 ,i= 1;
		System.out.print("Fibonacci Series of "+max+" numbers:");
		while(i<=max) {
			System.out.println(first+" ");
			int sum = first+next;
			first=next;
			next=sum;
			i++;
		}
		
	}

}




//recursion
/*static int fibo (int n) {
	if(n==0) 
		return 0;
	if(n==1 || n==2)
		return 1;
	return fibo(n-2)+fibo(n-1); 
}

int max =10;
		for(int i=0;i<max;i++) {
		System.out.println(fibo(i)+" ");
		}*/
