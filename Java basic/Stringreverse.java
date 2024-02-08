package testing;
import java.util.*;

public class Stringreverse {
	
	public String reverseString(String s) {
		if(s.isEmpty()) {//recursion
			System.out.println("STEING is EMPTY");
		return s;
	}else {
		return reverseString (s.substring(1))+s.charAt(0);
	}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Stringreverse obj = new Stringreverse();
		System.out.print("ENTER THE WORD:");
		String s = sc.nextLine();
		String a = obj.reverseString(s);
		System.out.println("Reverse String:"+a);
	}
	
}

