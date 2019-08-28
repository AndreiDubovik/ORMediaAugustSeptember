package by.ormedia.lesson5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lesson5Starter4 {

	public static void main(String[] args) {
		/*
		List<String>list = Arrays.asList("1","2","3");
		Iterator<String>it = list.iterator();
		while(it.hasNext())System.out.println(it.next());
		*/
		
		C[]arrayC = new C[50];
		for(int i=0;i<arrayC.length;i++)arrayC[i] = new C((int)(10000*Math.random()));
		Set<C>set = new TreeSet<>((c1,c2)->c1.compareTo(c2));
		for(C c:arrayC)set.add(c);
		Iterator it = set.iterator();
		while(it.hasNext())System.out.println(it.next());
		LambdaExample le = new LambdaExample(f->System.out.println(f));
		LambdaExample le2 = new LambdaExample(new IFunction(){

			@Override
			public void function(Object ob) {
				System.out.println(ob);
				
			}});
	}

}
