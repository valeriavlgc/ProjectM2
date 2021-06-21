package projectM2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fase4 {
	public static void main(String[] args) {
	
ArrayList<Character> name = new ArrayList<Character>();
ArrayList<Character> surname = new ArrayList<Character>();
name.add('v');
name.add('a');
name.add('l');
name.add('e');
name.add('r');
name.add('i');
name.add('a');
surname.add('l');
surname.add('a');
surname.add('v');
surname.add('i');
surname.add('n');

name.add(' ');

List<Character> fullName = Stream.concat(name.stream(), surname.stream()).collect(Collectors.toList());

System.out.println(fullName);


	}

}
