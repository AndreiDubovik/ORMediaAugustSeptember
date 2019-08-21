package by.ormedia.lesson3;

import static by.ormedia.lesson2.Lesson2.*;


public class Lesson3 {

public static void main(String[] args) {
		
		IStudent st1 = new Student();
		test((Student)st1);
		
	}
	
	private static void test(Student st){
		st = new Student("Freddy",44);
		System.out.println(st);
	}

}
