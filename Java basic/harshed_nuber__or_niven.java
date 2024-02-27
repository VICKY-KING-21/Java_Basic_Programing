package testing;

public class harshed_nuber__or_niven {

	public static void main(String[] args) {
		
		int num = 700;
		int sum=0,rem=0;
		int n= num;
		
		while(num>0) {
			rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		if(n%sum==0) {
			System.out.println(n + " is harshed number");
		}else {
			System.out.println(n + " is not harshed number");
		}

	}

}
