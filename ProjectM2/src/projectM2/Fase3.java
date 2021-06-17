package projectM2;
import java.util.*;
public class Fase3 {

	public static void main(String[] args) {
int valor = 0;
char clave;

//Char en lugar de string?

String elemento;

HashMap<String, Integer> mapa = new HashMap<String, Integer>();		
ArrayList<String> chars = new ArrayList<String>();
chars.add("v");
chars.add("a");
chars.add("l");
chars.add("e");
chars.add("r");
chars.add("i");
chars.add("a");
chars.add("l");
chars.add("a"); 
chars.add("v");
chars.add("i");
chars.add("n");

ListIterator lt = chars.listIterator();

//Posible mejora sería borrar la letra una vez ha sido rastreada para que no vuelva a iterar por ahí. 
	for(int i = 0; i < chars.size() ; i++) {
		
		while(lt.hasNext()) {
			elemento = (String)lt.next();
			//if (elemento.equalsIgnoreCase(Character.toString((chars.get(i))))) {
			if (elemento.equalsIgnoreCase(chars.get(i))) {
			valor += 1;
			//chars.remove(chars.get(i));
			}
			
		}
		mapa.put(chars.get(i),valor);
		valor = 0;
		lt = chars.listIterator();
    }
   
	
System.out.println(mapa);   
    }
}




/*chars.add("v");
chars.add("a");
chars.add('l');
chars.add('e');
chars.add('r');
chars.add('i');
chars.add('a');
chars.add('l');
chars.add('a'); 
chars.add('v');
chars.add('i');
chars.add('n'); */