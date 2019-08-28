package by.ormedia.lesson5;

public class Leson5Starter2 {

	public static void main(String[] args) {
		
		BuilderExample be = BuilderExample.Builder.getBuilder()
				.setX1(1)
				.setX2(7)
				.build();
		
		Integer i1 = 1;
		Integer i2 = 1;
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i1==i2);
		System.out.println(i3==i4);
	}

}
