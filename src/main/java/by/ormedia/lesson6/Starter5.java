package by.ormedia.lesson6;

public class Starter5 {

	public static void main(String[] args) {
		
		Object ob = new Object();
		System.out.println(ob.getClass());
		java.lang.Object ob2 = new java.lang.Object();
		System.out.println(ob2.getClass());
		Object ob3 = new Object(){};
		System.out.println(ob3.getClass());

	}

}
