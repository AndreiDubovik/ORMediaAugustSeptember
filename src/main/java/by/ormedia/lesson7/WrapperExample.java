package by.ormedia.lesson7;

import java.util.ArrayList;
import java.util.List;

public class WrapperExample {

	public static void main(String[] args) {
		
		int i = 1;
		boolean b = true;
		char ch = 'y';
		List<Object>list = new ArrayList<>();
		list.add(i);
		list.add(b);
		list.add(ch);
		System.out.println(list.get(0).getClass());
		System.out.println(list.get(1).getClass());
		System.out.println(list.get(2).getClass());
	}

}
