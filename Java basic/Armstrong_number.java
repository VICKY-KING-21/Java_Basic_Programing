package testing;
import java.util.*;

public class Armstrong_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the value :");
		int no1 = sc.nextInt();
		int no2= no1;
		int arm =0;
		do {
			int rem = no1%10;
			 arm = arm+(rem*rem*rem);
			no1= no1/10;
		}while(no1>0);
		if(no2==arm) {
			System.out.println("Armstorg");
		}else {
			System.out.println("Not Armstorng");
		}
	}

}
