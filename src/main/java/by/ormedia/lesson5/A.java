package by.ormedia.lesson5;

public class A {
	
	static{
		System.out.println("point a1 (static)");
	}
	
	{
		System.out.println("point a2 (non-static)");
	}
	
	public Integer a;
	
	public A(){
		System.out.println("point a3 (constr)");
	}

}
