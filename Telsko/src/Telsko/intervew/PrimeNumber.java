package Telsko.intervew;

public class PrimeNumber {

	public static void main(String[] args) {

		int num=31;
		boolean isprime = true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isprime= false;
				break;
			}
		}
		if(isprime)
		System.out.println("its  a prime Number");
		else
			System.out.println("Its not a prime Number");
	}

}
