package Telsko.intervew;

public class PerfectNumber {

	public static void main(String[] args) {

		int num =28;
		int sum =0;
		
		for(int i=1;i<num;i++) {
			
			if(num%i==0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
		if(num==sum) {
			System.out.println("Its Perfect Number");
		}
		else {
			System.out.println("Its not a perfect Number");
		}
		
	}

}
