package by.ormedia.lesson7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Starter {

	public static void main(String[] args) {
		/*
		int[]array = {1,2,3,4,5,8,1,1,75,5,6,7,8,8,9,10,11,54,1,1,4};
		int max = Arrays.stream(array).max().getAsInt();
		*/
		
		/*
		Stream<String>stream = Stream.of("ewqewqrew","hjfjhgfjhg","hgfh10000jgfhgj","2","999","h");
		stream.filter(s->s.length()<4).limit(1).map(s->s.concat("HELLO")).forEach(System.out::println);
		*/
		
		/*
		IntStream.range(100, 200).filter(f->f%2!=0).map(f->f+55).limit(10).forEach(System.out::println);
		*/
		
		/*
		List<String>list = Arrays.asList("1","sfsdf","sdf","qwe","1","ee","wewewewe");
		List<String> result = list.stream().filter(s->s.length()>5).collect(Collectors.toList());
		for(String s:result)System.out.println(s);
		*/
		
		/*
		
		List<Integer>list = Stream.iterate(7, s->s*3).limit(10).collect(Collectors.toList());
		for(Integer i:list)System.out.println(i);
		
		*/
		
		String line = null;
		Optional<String>op = Optional.ofNullable(line);
		if(op.isPresent())System.out.println(op.get().length());
	}

}
