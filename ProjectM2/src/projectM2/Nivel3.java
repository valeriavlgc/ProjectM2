package projectM2;


public class Nivel3 {

	public static void main(String[] args) throws InterruptedException {
int hour = 0, minutes = 0, i = 0, seconds = 0;	

//Es mejor hacer bucle infinito con otro tipo de loop?
//Las horas no se reinician porque es cronómetro no reloj. 
do {
	System.out.println(String.format("%02d" , hour) + ":" + String.format("%02d" , minutes) + ":" + String.format("%02d" , seconds));
	Thread.sleep(1000);
	seconds++;
	if (seconds == 60) {
		seconds = 0;
		minutes += 1;
	}
	if (minutes == 60) {
		minutes = 0;
		hour += 1;
	}
	
} while (i != 1);
	
		
	}

}
