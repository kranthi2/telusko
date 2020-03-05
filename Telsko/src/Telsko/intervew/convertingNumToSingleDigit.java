package Telsko.intervew;

public class convertingNumToSingleDigit {

	static long num= 970013841;
	static long sum=0;
	static long sum1=0;
	public static void main(String[] args) {
		
		long N =convertingNumToSingleDigit.convert();
		System.out.println(N);
		
		while(N>9||N>0) {
			 sum1=sum1+N%10;
				N=N/10;
			}
		System.out.println(sum1);
	}
	
	
		static long convert() {
			
			while(num>0) {
				sum=(sum+num%10);
				num=num/10;
			}
			return sum;
		
			
		}
			

}
