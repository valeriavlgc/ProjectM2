//corregir número 
package projectM2;

import java.util.ArrayList;

public class Fase2 {

	public static void main(String[] args) {

ArrayList<Character> chars = new ArrayList<Character>();

chars.add('v');
chars.add('a');
chars.add('l');
chars.add('e');
chars.add('r');
chars.add('i');
chars.add('a');
chars.add('7');
 
	for(int i = 0; i < chars.size() ; i++) {
		
		
		if (Character.isLetter(chars.get(i))){
			if (chars.get(i) == 'a' || chars.get(i) == 'e' || chars.get(i) == 'i' || chars.get(i) == 'o' || chars.get(i) == 'u') {
				System.out.println(chars.get(i) + " vocal");
				
			} else {
				System.out.println(chars.get(i) + " consonante");
			}
			
		
			
		  } else if (Character.isDigit(chars.get(i))) {

			   System.out.println(chars.get(i) + " número");
		  } 
	
			
	}
	
}



	}


