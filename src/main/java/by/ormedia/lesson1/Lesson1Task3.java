package by.ormedia.lesson1;

import java.util.Arrays;

public class Lesson1Task3 {

	public static void main(String[] args) {
		int array1[] = randomArray(6, 0, 30);
		int array2[] = randomArray(11, 0, 30);
		System.out.println("1-й массив:");
		show(array1);
		System.out.println("2-й массив:");
		show(array2);
		System.out.println("новый массив:");
		show(cutAndMerge(array1, array2, false));

	}

	public static int[] cutAndMerge(int[] array1, int[] array2, boolean max) {
		int length = array1.length > array2.length ? array2.length : array1.length;
		int result[] = new int[length];
		for (int i = 0; i < length; i++) {
			if (max) {
				if (array1[i] > array2[i]) {
					result[i] = array1[i];
				} else
					result[i] = array2[i];
			} else {
				if (array1[i] < array2[i]) {
					result[i] = array1[i];
				} else
					result[i] = array2[i];
			}
		}
		return result;
	}

	public static void sort(int[] array, boolean fromMinToMax) {
		Arrays.sort(array);
		if (!fromMinToMax) {
			int[] temp = new int[array.length];
			for (int i = 0; i < array.length; i++)
				temp[i] = array[array.length - 1 - i];
			for (int i = 0; i < array.length; i++)
				array[i] = temp[i];
		}

	}

	public static void replace(int[] array, int toReplace, int replaceTo) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == toReplace)
				array[i] = replaceTo;
	}

	public static int indexOfMaxDifference(int[] array) {
		int diff = 0;
		int index = 0;
		for (int i = 0; i < array.length - 1; i++) {
			int temp = Math.abs(array[i + 1] - array[i]);
			if (temp > diff) {
				diff = temp;
				index = i;
			}
		}
		return index;
	}

	public static int maxSequence(int array[], int number) {
		int seq = 0;
		int tempSeq = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				tempSeq++;
				if (tempSeq > seq)
					seq = tempSeq;
			} else
				tempSeq = 0;
		}
		return seq;
	}

	public static int oddEvenSum(int[] array, boolean odds) {
		int sum = 0;
		if (odds) {
			for (int i : array)
				if (i % 2 == 0)
					sum += i;
		} else {
			for (int i : array)
				if (i % 2 != 0)
					sum += i;
		}
		return sum;
	}

	public static void show(int[] array) {
		for (int i : array)
			System.out.print(i + " ");
		System.out.println();
	}

	public static int[] randomArray(int length, int min, int max) {
		int array[] = new int[length];
		for (int i = 0; i < array.length; i++)
			array[i] = random(min, max);
		return array;
	}

	public static int random(int min, int max) {
		return (int) ((max - min + 1) * Math.random()) + min;
	}

}
