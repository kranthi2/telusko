package Telsko.concepts;

public class threeDArray {

	public static void main(String[] args) {

		int a[][][]= new int[3][3][3];
		
		// to assaign the values
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a.length;k++) {
					a[i][j][k]=i+j+k;
				}
			}
		}
		// to print all the values in 3D Array 
		for(int i[][]:a) {
			for(int j[]:i) {
				for(int k:j) {
					System.out.print(k+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
