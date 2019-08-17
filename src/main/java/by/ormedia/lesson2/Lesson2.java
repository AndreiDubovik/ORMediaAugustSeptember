package by.ormedia.lesson2;

import java.util.Arrays;

public class Lesson2{
	
	static String line = "hgfjhfjhg";

	public static void main(String[] args) {
		int i = 7;
		int z = i==2?5:0;
		System.out.println(z);
	}
	
	protected static void sort(int array[]){
		for(int x=0;x<array.length;x++){
		for(int i = 0;i<array.length-1;i++){
			if(array[i]<array[i+1]){
				int temp = array[i+1];
				array[i+1] = array[i];
				array[i] = temp;
			}
		}}
	}
	
	
	
	public static void anotherTest(int[]array){
		array = new int[array.length];
		show(array);
	}
	
	public static int maxSequence(int[]array, int number){
		int count = 0;
		int temp = 0;
		for(int i=0;i<array.length;i++){
			if(array[i]==number){
				temp++;
				if(i==array.length-1&&temp>count)count=temp;
			}else{
				if(temp>count)count=temp;
				temp = 0;
			}
		}
		return count;
	}
	
	private static int random(int min, int max){
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	public static int[] randomArray(int length, int min, int max){
		int[]result = new int[length];
		for(int i = 0;i<length;i++)result[i]=random(min,max);
		return result;
	}
	
	public static void show(int[]array){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
	public static void show(int[][] array){
		for(int[]a:array)show(a);
	}

}
