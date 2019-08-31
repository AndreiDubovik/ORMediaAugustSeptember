package by.ormedia.lesson6;

public class Starter3 {
	
	public static void main(String...args){
		//test2("g","7");
		String lines[] = {"jhgj","jhgjhg"};
		test2(lines);
	}
	
	public static void test1(String[]args){
		for(String s:args)System.out.println(s);
	}
	
	public static void test2(String...args){
		for(String s:args)System.out.println(s);
	}
	

}
