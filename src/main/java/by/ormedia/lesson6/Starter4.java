package by.ormedia.lesson6;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Starter4 {

	public static void main(String[] args) {
		
		Currency c = Currency.RUR;
		switch(c){
		case EUR:System.out.println("ЕВРО");
		break;
		default:System.out.println("Нам нужны только ЕВРО!!!");
		}

		Queue<String> list = new LinkedList<>();
		
		
	}
	
	public static void showCurrency(Currency c){
		System.out.println(c.getName());
	}

}
