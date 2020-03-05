package Telsko.intervew;

public class NoOfObjects {

	static int i;
	public NoOfObjects() {
		i++;
	}
	void counter() {
		System.out.println("Number of objects are: "+i);
	}
	
	public static void main(String[] args) {

		NoOfObjects obj1 = new NoOfObjects();
		NoOfObjects obj2 = new NoOfObjects();
		NoOfObjects obj3 = new NoOfObjects();
		
		obj1.counter();
	}

}
