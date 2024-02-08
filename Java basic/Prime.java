package testing;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		boolean flag =true;
		//int middle = n/2;
		for(i=2;i<n/2;i++) {
			if(n%i==0) {
			flag = false;
			break;
		}
		}	
		if(flag)
			System.out.println("is Prime");
		else
		System.out.println("is Not Prime");

		}
		

}
