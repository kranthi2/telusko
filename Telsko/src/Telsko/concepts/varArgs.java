package Telsko.concepts;

public class varArgs {

	public static void main(String[] args) {

		Display.show(1,2,3,4,5);
		Display.show(1);
		
		
	}
	
	static class Display{
		
		public static void show(int ... a) {
			for(int i:a) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		public static void show(int a) {
			System.out.println(a+" single args method");
		}
	}

}
