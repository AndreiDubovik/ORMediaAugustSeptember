package by.ormedia.lesson5;

public class Lesson5Starter {

	public static void main(String[] args) {
		
		IInterface i = new IInterface<Object>(){

			@Override
			public int getInt() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public double getDouble() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public Object getSomething() {
				// TODO Auto-generated method stub
				return null;
			}};
			
			MyClass mc1 = new MyClass(){
				public String toString(){
					return "Hello!";
				}
			};
			MyClass mc2 = new MyClass();
			System.out.println(mc1);
			System.out.println(mc2);
			Object ob = new Object(){
				public int hashCode(){
					return 1;
				}
			};
	}

}
