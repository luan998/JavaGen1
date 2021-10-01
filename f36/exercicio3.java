package f36;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		int seg,min,hora,horares,segres;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite em segundos a duração do evento: ");
		seg = read.nextInt();
		/*min = seg/60;
		segres = seg%60;
		hora = min/60;
		minres = min%60; */
		
		hora = seg/3600;
		min = (seg%3600)/60;
		segres = (seg%3600)%60;
		System.out.println("A duração do evento foi de "+hora+" horas,"+min+" minutos e "+segres+" segundos.");
	}

}
