package by.ormedia.lesson4;

public interface ILibraryItem {
	
	public static String VARIABLE = "Bla bla bla";
	default void test(){
		System.out.println("hello");
	}

}
