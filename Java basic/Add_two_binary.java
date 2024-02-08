package testing;
import java.util.*;
public class Add_two_binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value 1:");
		String a = sc.next();
		System.out.print("Enter the value 2:");
		String b = sc.next();
		int n1 = Integer.parseInt(a, 2);
		int n2 = Integer.parseInt(b, 2);
		int n3 = n1+n2;
		System.out.println("n1:"+Integer.toBinaryString(n1));
		System.out.println("n2:"+Integer.toBinaryString(n2));
		System.out.println("n3=n1+n2:"+Integer.toBinaryString(n3));
	}

}
