package by.ormedia.lesson5;

public class B extends A{
	
	static{
		System.out.println("point b1 (static)");
	}
	
	{
		System.out.println("point b2 (non-static)");
	}
	
	public B(){
		System.out.println("point b3 (constr)");
	}

}
