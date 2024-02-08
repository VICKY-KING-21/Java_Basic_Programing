package testing;

public class Decimal_to_binary {

	public static void main(String[] args) {
		int decimal=11;
		String binary = " ";
		while(decimal>0) {
			int rem = decimal%2;
			binary = rem+binary;
			decimal=decimal/2;
		}
		System.out.println(binary);

	}

}
