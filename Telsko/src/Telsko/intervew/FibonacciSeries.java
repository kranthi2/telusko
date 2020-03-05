package Telsko.intervew;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int k=0,a=1,b=1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		
		int n= scn.nextInt();
		
		System.out.print("1 1 ");
		
		while(k<=n) {
			k=a+b;
			if(k>=n)
				break;
			System.out.print(k+" ");
			a=b;
			b=k;
			
			
		}
	}

}
