package Telsko.concepts;

public class twoDArrays {

	public static void main(String[] args) {

		// 2D Array
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//Enhanced for loop
		
		for(int x[]:a) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		
	}

}
