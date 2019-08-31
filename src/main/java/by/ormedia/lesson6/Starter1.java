package by.ormedia.lesson6;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import static by.ormedia.lesson2.Lesson2.*;

public class Starter1 {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new TreeMap<>((c1,c2)->c1.compareTo(c2));
		for(int i = 0; i<25;i++){
			int key = random(0, 1000000);
			String value = Integer.toHexString(key);
			System.out.println("key: "+key+", value: "+value);
			map.put(key, value);
		}
		System.out.println();
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()){
			Integer key = it.next();
			System.out.println(key+"   "+map.get(key));
		}
	}

}
