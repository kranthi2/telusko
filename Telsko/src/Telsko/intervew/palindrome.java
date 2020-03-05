package Telsko.intervew;

public class palindrome {

	public static void main(String[] args) {

		int num = 12321;
		int num1=num;
		int rev =0;
		
		while(num!=0) {
			rev= rev*10+num%10;
			num = num/10;
			
		}
		System.out.println(rev);
		
		if(num1==rev) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not a Palindrome");
		}
	}

}
