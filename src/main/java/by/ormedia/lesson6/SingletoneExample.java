package by.ormedia.lesson6;

public class SingletoneExample {
	
	private static SingletoneExample INSTANCE;
	
	private SingletoneExample(){
		
	}
	
	public static SingletoneExample getInstance(){
		synchronized(INSTANCE){
		if(INSTANCE==null)INSTANCE = new SingletoneExample();
		}
		return INSTANCE;
	}
}
