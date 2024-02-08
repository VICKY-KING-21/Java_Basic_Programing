package testing;
import java.util.*;
public class Perfect_number {

	public static void main(String[] args) {
		Scanner bc = new Scanner(System.in);
		System.out.print("Enter the value :");
		int no = bc.nextInt();
		int perfect =0;
		int i =1;
		do {
			if(no%i==0)
				perfect= perfect+i;
				i=i+1;
		}while(i<=no/2);
		if(no==perfect) {
			System.out.println("Perfect ");
		}else {
			System.out.println("Not Perfect");
		}
	}

}
