package f36;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		
		int dias,diares,mes,ano,anoRes;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Escreva seu tempo de vida em dias: ");
		dias = read.nextInt();
		ano=dias/365;
		anoRes=dias%365;
		mes=anoRes/30;
		diares=anoRes%30;
		System.out.println("Você viveu "+ano+" anos,"+mes+" meses e "+diares+" dias.");
	}
}
