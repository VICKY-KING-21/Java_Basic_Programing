package testing;
import java.util.*;

public class Facter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER VALUE:");
		int a = sc.nextInt();
		int count =0 ;
		int odd =0;
		int even = 0;
		int i;
		for( i =1;i<=a;++i) {
			if(a%i==0) {
				count++;
				if(i%2==0) {
					even++;
				}else {
					odd++;
				}
			}
			
		}
		System.out.println(count);
		System.out.println("EVEN NUMBER:"+even);
		System.out.println("Odd NUMBER :"+odd);
		sc.close();
	}

}
