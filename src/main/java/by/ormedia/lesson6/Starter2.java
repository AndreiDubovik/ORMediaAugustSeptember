package by.ormedia.lesson6;

import java.util.Scanner;

public class Starter2 {

	public static void main(String[] args) {
		
		int i = enterNumber("Введите число от -10 до 10", -10,10);
		try {
			System.out.println(getInt(i));
		} catch (Exception e) {
			System.out.println("Вы ввели неверное число");
		}
		
		

	}
	
	public static int enterNumber(String question){
		System.out.println(question);
		Scanner sc = new Scanner(System.in);
		try{
		int i = sc.nextInt();
		return i;
		}catch(java.util.InputMismatchException|NumberFormatException e2){
			System.out.println("Ввод неверный");
			return enterNumber(question);
		}catch(Exception e){
			return enterNumber(question);
		}finally{
			sc.close();
		}
	}
	
	public static int enterNumber(String question, int min, int max){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число от "+min+" до "+max);
		String line = sc.nextLine();
		try{
			int i = Integer.parseInt(line);
			if(i<min||i>max)throw new NumberFormatException();
			return i;
		}catch(NumberFormatException e){
			System.out.println("Ввод неверный");
			return enterNumber(question, min,max);
		}finally{
			sc.close();
		}
	}
	
	public static int getInt(int i) throws Exception{
		if(i<0)throw new Exception();
		return i;
	}

}
