package ejercicio2;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestStreams {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("Hola");
		strings.add("Probando Streams");
		strings.add("Chau");
		Stream<String> streangs = strings.stream();
		//System.out.println(streangs.map(s->s+"_MAPPED").collect(Collectors.toList()));
		streangs.close();
		//streangs.forEach(System.out::println);
		//streangs.forEach(s -> System.out.println(s));
	}
}


/*
List<String> even = strings.stream()
					.map(string -> Integer.valueOf(s))
					.filter(integer -> integer % 2 == 0)
					.distinct()
					.sorted()
					.map(integer::toString)
					.collect(Collectors.toList());
*/