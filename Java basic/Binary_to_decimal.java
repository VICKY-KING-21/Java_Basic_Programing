package testing;

public class Binary_to_decimal {

	public static void main(String[] args) {
		int binary = 1010;
		int decimal=0;
		int i =0;
		while(binary>0) {
			int rem = binary%10;
			decimal = (int) (decimal+(rem*Math.pow(2, i)));
			binary=binary/10;
			i=i+1;
		}
		System.out.println(decimal);
	}

}


