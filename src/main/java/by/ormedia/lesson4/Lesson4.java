package by.ormedia.lesson4;

import by.ormedia.lesson2.Lesson2;

public class Lesson4 {

	public static void main(String[] args) {
		
		int length = Lesson2.random(20, 40);
		int min = Lesson2.random(-100, 100);
		int max = Lesson2.random(10, 100);
		int array[] = Lesson2.randomArray(length, min, max);
		Lesson2.show(array);
		int[]values = new int[max-min+1];
		for(int i = 0; i<array.length; i++){
			values[array[i]-min]++;
		}
		for(int k=0;k<values.length;k++){
			System.out.println("Число "+(k+min)+" встречалось "+values[k]+" раз");
		}

	}

	
}
