package testing;
import java.util.*;
public class Triangur_Number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number =sc.nextInt();
		int tri =0;
		for(int i =1;i<=number;i++) {
			tri = tri+i;
		}
		System.out.println(tri);
	}

}
