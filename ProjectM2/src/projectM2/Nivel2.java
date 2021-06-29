package projectM2;

import java.util.Scanner;

public class Nivel2 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);	

System.out.println("Elige una opción: \n 1-. Escala de números \n 2-. Piramide");
byte opcion = sc.nextByte();

		switch(opcion) {
		case 1: 
			escalaNum();
			break;
		case 2:
			piramide();
			break;
		default:
			System.out.println("Opción incorrecta");
			break;
		}
					
	}
	
public static void escalaNum(){
Scanner sc = new Scanner(System.in);		

System.out.println("Introduce un número:");
int numero = sc.nextInt();


		for (int i = 0; i < numero; i++) {
			
			//System.out.print(i);
			System.out.println();
			for (int j = 0; j <= i; j++) {
				System.out.print(j+1);	
					
			}
			
		
	    }
		
 
	
}	
public static void piramide(){
Scanner sc = new Scanner(System.in);		

String espacio = "";
System.out.println("Introduce un número:");
int numero = sc.nextInt();
	
   for (int i = numero - 1; i > 0; i--) {
	System.out.print(espacio);
	  for (int j = 0; j < i; j++) {
		  System.out.print('*');
		  
		  
	  }
	   espacio += " ";
	   i -=1;
	   System.out.println(); 
	   
   }
  // System.out.println(espacio + "*"); 
}
}
