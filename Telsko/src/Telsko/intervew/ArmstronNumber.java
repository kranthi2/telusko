package Telsko.intervew;

public class ArmstronNumber {

	public static void main(String[] args) {

		int num=153;
		int temp=num;
		int r;
		int sum = 0;
		
		while(num>0) {
		r=num%10;
		num=num/10;
		sum = sum + r*r*r;
		}
		System.out.println(sum);
		
		if(temp==sum)
			System.out.println("Its an Armstrong Number");
		else
			System.out.println("Its not an Armstrong Number");
	}	
}
